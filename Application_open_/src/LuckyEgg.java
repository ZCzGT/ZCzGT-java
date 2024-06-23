import javax.swing.*;
import java.awt.*;

public class LuckyEgg extends JFrame {
    public LuckyEgg() throws HeadlessException {

        setTitle("Lucky Egg");
        //设置居中
        int width = 940;
        int height = 940;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenwidth = tk.getScreenSize().width;
        int screenheight = tk.getScreenSize().height;
        setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel winJLabel = new JLabel(new ImageIcon("..\\Application_open_Training\\img.png"));
        winJLabel.setBounds(0,0,500,500);
        getContentPane().add(winJLabel);




    }
}
