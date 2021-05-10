package lab11.exercitiu2.service;

import lab11.exercitiu2.dto.User;
import lab11.exercitiu2.exception.UnauthorizedException;

import java.util.ArrayList;
import java.util.List;

import static lab11.exercitiu2.utils.Constants.*;

public class AuthorizationService {

    private List<User> usersInSystem = new ArrayList<>();
    private User loggedInUser;

    public AuthorizationService() {
        this.initData();
    }

    // daca se gaseste userul se inregistreaza "sesiunea", daca nu se arunca exceptie de Unauthorized cu mesajul  "Username and password invalid"
    public void login(String username, String password) {

    }

    public void logout() {
        this.loggedInUser = null;
    }

    public String getLoggedInUsername() {
        if(loggedInUser != null) {
            return loggedInUser.getEmail();
        }
        throw new UnauthorizedException("You are not authorized. Please log in.");
    }

    private void initData() {
        usersInSystem.add(new User(MAIL_POPESCU, "parola"));
        usersInSystem.add(new User(MAIL_QUEEN, "parola"));
        usersInSystem.add(new User(MAIL_JONNY, "parola"));

    }
}
