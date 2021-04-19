package lab9.db.service;

import lab9.db.dto.User;
import lab9.db.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public User save(User user) {
        if(user.getEmail() != null && user.getEmail().isEmpty()) {
            throw new RuntimeException("Email cannot be empty");
        }
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public boolean deactivate(String email) {
       return userRepository.deactivate(email);
    }
}
