import java.io.*;
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
            System.out.println("Server is running in the port " + PORT);

            Socket localSocket = serverSocket.accept();
            System.out.println("Server accepted...");
            System.out.println(localSocket.getPort());
            System.out.println(localSocket.getInetAddress());

            DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(localSocket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String message = "", reply = "";

            while (!message.equals("finish")) {
                message = dataInputStream.readUTF();
                System.out.println(message);
                reply = bufferedReader.readLine();
                dataOutputStream.writeUTF(reply);
                dataOutputStream.flush();
            }

            dataInputStream.close();
            dataOutputStream.close();
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
