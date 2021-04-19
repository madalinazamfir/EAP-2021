package lab9.socket.server;

import java.util.HashMap;
import java.util.Map;

public class Greetings {

    private static Map<String, String> GREETING_TO_ORIGIN = new HashMap<>();

    static {
        GREETING_TO_ORIGIN.put("Buna ziua", "Romanii s-au conectat");
        GREETING_TO_ORIGIN.put("Good afternoon", "Englezii s-au conectat");
    }

    public static String getOrigin(String helloType) {
        return GREETING_TO_ORIGIN.get(helloType);
    }
}
