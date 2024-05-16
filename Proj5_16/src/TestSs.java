import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSs {
    public static void main(String[] args) {
        try {
            ServerSocket Ss = new ServerSocket(4787);
            System.out.println("连接成功 2TESTSS");
            while (true) {
                Socket s = Ss.accept();
                System.out.println("连接建立");
                Thread thread = new thre(s);
                thread.start();
            }
        } catch (IOException e) {
            System.out.println("连接异常" + e.getMessage());
        }
    }
}