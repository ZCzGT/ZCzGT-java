import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestS {
    public static void main(String[] args) {
        try {
            Socket S = new Socket("127.0.0.1",4787);
            System.out.println("Connect Right TESTS");
            OutputStream os = S.getOutputStream();
            os.write("我是230512147 张鹏".getBytes());
            System.out.println("Send Right");
            os.close();

        } catch (IOException e) {
            System.out.println("连接失败"+ e.getMessage());
        }

    }
}