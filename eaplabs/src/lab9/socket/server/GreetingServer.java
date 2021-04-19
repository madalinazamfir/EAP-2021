package lab9.socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetingServer {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8090)) {
            System.out.println("Server is up on port 8090");

            while (true) {
                Socket client = serverSocket.accept();
                DataInputStream messageReceived = new DataInputStream(client.getInputStream());
                String message = messageReceived.readUTF();
                System.out.println(message);
                System.out.println(Greetings.getOrigin(message));
                messageReceived.close();
            }
        } catch (IOException ioException) {
            throw new RuntimeException("Server is down. Cannot connect to localhost 8090");
        }
    }
}
