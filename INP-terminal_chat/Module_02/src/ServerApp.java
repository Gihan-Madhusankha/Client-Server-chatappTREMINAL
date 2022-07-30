import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Gihan Madhusankha
 * 2022-07-31 12:15 AM
 **/

public class ServerApp {
    public static void main(String[] args) {

        final int PORT = 8000;
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running in the port "+ PORT);

            Socket localSocket = serverSocket.accept();
            System.out.println("Server accepted...");
            System.out.println(localSocket.getPort());
            System.out.println(localSocket.getInetAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}