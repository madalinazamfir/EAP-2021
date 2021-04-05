package lab7.map.exercitiu;

import lab7.map.exercitiu.service.UserService;

import java.util.HashSet;
import java.util.Set;

public class EntryPoint {

    /* Sa se creeze un sistem care tine evidenta userilor si permisiunilor lor folosind un Map
    Operatiuni:
        - adaugare user nou - daca exista arunca exceptie UserAlreadyExistsException
        - adaugare de permisiuni pentru un user - daca userul nu exista se arunca exceptie UserNotFoundException
        - stergere user  - UserNotFoundException daca nu exista
        - hasPermission - true/false - se verifica daca userul are o anumita permisiune
     */

    public static void main(String[] args) {

        String firstUser = "popescu.alexandr@gmail.com";
        Set<Integer> permissions = new HashSet<>();
        permissions.add(1);
        UserService userService = new UserService();
        userService.add(firstUser);
        userService.addPermissionFor(firstUser, permissions);
        userService.addPermissionFor("nonExistitng", permissions);
    }
}
