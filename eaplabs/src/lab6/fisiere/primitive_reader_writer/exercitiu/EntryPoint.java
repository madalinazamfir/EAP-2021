package lab6.fisiere.primitive_reader_writer.exercitiu;

import lab6.fisiere.primitive_reader_writer.exercitiu.dto.User;
import lab6.fisiere.primitive_reader_writer.exercitiu.service.UserService;
import lab6.fisiere.primitive_reader_writer.exercitiu.service.UserServiceImpl;

public class EntryPoint {

    /*
        Sa se realizeze un serviciu care, pentru fiecare operatie din UserService, logheaza un messaj intr un fisier
     */

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user = new User("Alexandru");
        userService.add(user);
        userService.edit("Marius");
        userService.delete(user);
    }
}
