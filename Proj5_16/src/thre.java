import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class thre extends Thread{
    Socket s ;
    public thre(Socket s){
        this.s = s;
    }
    @Override
    public void run(){
        System.out.println("Connected port:" + s.getPort());
        try {
            InputStream is = s.getInputStream();
            byte[] buttf = new byte[1024];
            int le = is.read(buttf);
            String st = new String(buttf,0,le);
            System.out.println(st);
            is.close();
            s.close();
            System.out.println("port:"+s.getPort()+"Over");
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

}