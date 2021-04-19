package lab9.db;

import lab9.db.dto.User;
import lab9.db.service.UserService;

public class EntryPoint {

    public static void main(String[] args) {
        UserService userService = new UserService();

        User user1 = new User("Popescu Mihai", "popescu@email.com");
        User user2 = new User("Ionescu Alina", "alina_ionescu@email.com");

        userService.save(user1);
        userService.save(user2);

        // sout-ul este in scop didactic, sa vedem ca exista 2 useri in baza. Sout nu reprezinta implementare.
        System.out.println(userService.findAll());

        boolean wasDeactivated = userService.deactivate("popescu@email.com");
        if(wasDeactivated) {
            System.out.printf("User was deactivated");
        }
    }
}
