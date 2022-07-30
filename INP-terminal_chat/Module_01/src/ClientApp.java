import java.io.IOException;
import java.net.Socket;

/**
 * @author : Gihan Madhusankha
 * 2022-07-30 11:24 PM
 **/

public class ClientApp {
    public static void main(String[] args) {

        final int PORT = 8000;
        try {
            Socket socket = new Socket("localhost", PORT);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
