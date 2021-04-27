package lab10.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//pentru simplitate la laborator am folosit o lista deja populata, dar in mod normal aceste permisiuni ar trebui sa fie persistente in baza si interogata baza pentru a face rost de ele.
public class PermissionService {

    // intrebare: ce se intampla cand avem variabile declarate final?
    private final List<String> permissions = new ArrayList<>();

    public PermissionService() {
        init();
    }

    public List<String> getAll() {
        return permissions;
    }

    private void init() {
        permissions.add("Change settings permission");
        permissions.add("Upload resources permission");
        permissions.add("Download resources permission");
        permissions.add("Schedule meetings permission");
    }

    // doar pentru a putea face init de useri - nu vreau sa vad random-uri in proiecte
    public List<String> getRandomPermission() {
        List<String> randomPermissions = new ArrayList<>();
        Random random = new Random();
        int index = random.nextInt(permissions.size());
        randomPermissions.add(permissions.get(index));
        // next permission
        int secondIndex = random.nextInt(permissions.size());
        while(secondIndex == index) {
            secondIndex = random.nextInt(permissions.size());
        }
        randomPermissions.add(permissions.get(secondIndex));
        return randomPermissions;
    }
}
