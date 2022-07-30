import java.io.*;
import java.net.Socket;

/**
 * @author : Gihan Madhusankha
 * 2022-07-31 1:07 AM
 **/

public class ClientApp {
    public static void main(String[] args) {
        
        final int PORT = 8000;
        try {
            Socket socket = new Socket("localhost", PORT);

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String message = "", reply = "";

            while (!message.equals("finish")) {
                reply = bufferedReader.readLine();
                dataOutputStream.writeUTF(reply);
                message = dataInputStream.readUTF();
                System.out.println(message);
                dataOutputStream.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
