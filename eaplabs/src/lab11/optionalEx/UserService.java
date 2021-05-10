package lab11.optionalEx;

import lab10.dto.User;

public class UserService {
    private UserRepository repository = new UserRepository();

    public void methodWithoutOptional() {
        User user = repository.findUserByEmailWithoutOptional("noUser@gmail.com");

        if(user != null) {
            // restul codului
        }
    }

    public void methodWithOptional() {
        User user = repository.findUserByEmail("noUser@gmail.com").orElseGet(() -> new User());
//        User user = repository.findUserByEmail("noUser@gmail.com").orElseGet(null); nerecomandat
        // in continuare nu mai am nevoie sa verific daca userul e null sau nu
    }
}
