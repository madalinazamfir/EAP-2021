package lab10.service;

import lab10.dto.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

// pentru simplitate la laborator am ales sa initializez o lista de useri, dar in viata reala aceste informatii ar trebui sa fie persistente (in baza de date, fisier, etc);
public class UserService {

    private static UserService userService = new UserService();

    private final List<User> users = new ArrayList<>();
    private final PermissionService permissionService = new PermissionService();

    private UserService() {
        this.init();
    }

    public static UserService getInstance(){
        return userService;
    }

    //
    public Vector<Vector<String>> getAll() {
        Vector<Vector<String>> all = new Vector<>();
        this.users.stream()
                .map(this::map)
                .forEach(all::add);
        return all;

    }

    public List<User> searchByEmail(String email){
        return this.users.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .collect(Collectors.toList());

    }

    public void delete(int index) {
        this.users.remove(index);
    }

    public User add(User user) {
        this.users.add(user);
        return user;
    }

    private Vector<String> map(User user) {
        Vector<String> vector = new Vector<>();
        vector.add(user.getName());
        vector.add(user.getEmail());
        vector.add(user.isActive() ? "yes" : "no");
        return vector;
    }

    private void init() {
        User user1 = new User();
        user1.setName("Popescu Ioana");
        user1.setEmail("ioana_popescu@email.com");
        user1.setActive(false);
        user1.setPermissions(permissionService.getRandomPermission());
        this.users.add(user1);

        User user2 = new User();
        user2.setName("Constantin Mihai");
        user2.setEmail("costm@gmail.com");
        user2.setActive(true);
        user2.setPermissions(permissionService.getRandomPermission());
        this.users.add(user2);

        User user3 = new User();
        user3.setName("Iona Alina");
        user3.setEmail("alina123@gmail.com");
        user3.setActive(true);
        user3.setPermissions(permissionService.getRandomPermission());
        this.users.add(user3);
    }
}
