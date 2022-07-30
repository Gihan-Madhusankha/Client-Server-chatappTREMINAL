import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Gihan Madhusankha
 * 2022-07-30 10:57 PM
 **/

public class ServerApp {
    public static void main(String[] args) {

        final int PORT = 8000;
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running in port : "+PORT);

            Socket localSocket = serverSocket.accept();
            System.out.println("server accepted...");
            System.out.println(localSocket.getPort());
            System.out.println(localSocket.getLocalPort());
            System.out.println(localSocket.getLocalAddress());
            System.out.println(localSocket.getInetAddress());

            InputStreamReader inputStreamReader = new InputStreamReader(localSocket.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
