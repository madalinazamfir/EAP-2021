package lab11.optionalEx;

import lab10.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> users = new ArrayList<>();

    public UserRepository() {
        User user = new User();
        user.setEmail("madalina@email.com");
        this.users.add(user);
    }

    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public User findUserByEmailWithoutOptional(String email) {
        User found = null;
        for (User user: users) {
            if(user.getEmail().equals(email)) {
                found = user;
            }
        }
        return found;
    }
}
