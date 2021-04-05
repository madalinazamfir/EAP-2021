package lab7.map.exercitiu.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserService {

    private Map<String, Set<Integer>> users = new HashMap<>();

    public void add(String username) {
        // users.containsKey(username)
        if(users.containsKey(username)) {
            throw new RuntimeException("Already exists");
        } else {
            users.put(username, new HashSet<>());
        }
    }

    public void addPermissionFor(String username, Set<Integer> permission) {
        validate(username);
        users.put(username, permission);
        System.out.println(users.keySet());
    }

    public void delete(String username) {
        validate(username);
        users.remove(username);
    }

    public boolean hasPermission(String username, Integer permission) {
        validate(username);
        return users.get(username).contains(permission);
    }

    private void validate(String username) {
        if (!users.containsKey(username)) {
            throw new RuntimeException("User not found");
        }
    }
}
