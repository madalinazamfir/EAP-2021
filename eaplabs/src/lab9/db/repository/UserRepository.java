package lab9.db.repository;

import lab9.db.dto.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public User save(User user) {
        try(Connection connection = getConnection()) {
            String query = "INSERT into users(name, email, is_active) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setInt(3, user.getIsActive());

            // executeUpdate se foloseste pentru operatiile de insert, update, delete
            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            while(resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }
            resultSet.close();
            return user;
        } catch (SQLException throwables) {
            // este recomandat sa prindem SQLException pentru ca divulga in mesajul ei informatii sensibile despre db (informatii de conectare, structura bazei, etc
            throw new RuntimeException("Something went wrong when trying to save the user: " + user.getEmail());
        }
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try(Connection connection = getConnection()) {
            String query = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // se poate lua informatia si cu numele coloanei dar este recomandat sa folositi index-ul pentru ca un nume de coloana se poate schimba mai des decat structura tabelei
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setIsActive(resultSet.getInt("is_active"));
                users.add(user);
            }

            resultSet.close();
            return users;
        } catch (SQLException throwables) {
            // este recomandat sa prindem SQLException pentru ca divulga in mesajul ei informatii sensibile despre db (informatii de conectare, structura bazei, etc
            throw new RuntimeException("Something went wrong when trying to retrieve all users");
        }

    }

    public boolean deactivate(String email) {
        try(Connection connection = getConnection()) {
            String query = "{?= call deactivate_user(?)}";
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.setString(2, email);
            callableStatement.execute();
            int response = callableStatement.getInt(1);

           return response == 1;
        } catch (SQLException throwables) {
            throw new RuntimeException("Something went wrong when trying to deactivate user: " + email);
        }
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/user_entitlement", "root", "root-pass");
        } catch (SQLException throwables) {
            throw new RuntimeException("Cannot connect to db");
        }
    }
}
