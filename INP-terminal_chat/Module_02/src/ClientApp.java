import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
