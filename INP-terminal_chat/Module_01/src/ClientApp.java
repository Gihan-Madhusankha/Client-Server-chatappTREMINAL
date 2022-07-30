import java.io.IOException;
import java.io.PrintWriter;
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

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("Hello there, how are you...");
            printWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
