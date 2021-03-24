package lab5.exercitiu2;

import java.util.UUID;

public interface Identifiable {

   default String generateId() {
        return UUID.randomUUID().toString();
    }

    String getId();
}
