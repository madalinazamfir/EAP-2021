package lab9.socket.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class RomanianClient {

    public static void main(String[] args) throws IOException {
        try(Socket client = new Socket("localhost", 8090)) {
            DataOutputStream messageToSend = new DataOutputStream(client.getOutputStream());
            messageToSend.writeUTF("Buna ziua");
            messageToSend.flush();
            messageToSend.close();
        }

    }
}
