import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("欢迎你来到货物管理界面");
//
//        //设置背景
//        JLabel winJLabel = new JLabel(new ImageIcon("..\\Application_open_Training\\img.png"));
//        winJLabel.setBounds(0,0,500,500);
//        loginFrame.getContentPane().add(winJLabel);

//        loginFrame.setBounds(0, 0, 500, 500);
        //设置居中
        int width = 500;
        int height = 500;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenwidth = tk.getScreenSize().width;
        int screenheight = tk.getScreenSize().height;
        loginFrame.setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);



        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setBackground(Color.pink);
        loginFrame.setAlwaysOnTop(true);

        BorderLayout mainLayout = new BorderLayout();
        loginFrame.getContentPane().setLayout(mainLayout);

        //这个是最顶部的提示界面
        JLabel titleLabel = new JLabel("欢迎你来到货物管理登录界面");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
        titleLabel.setForeground(Color.darkGray);
        loginFrame.getContentPane().add(titleLabel, BorderLayout.NORTH);
//      loginLabel.setBounds(100, 100, 300, 100);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(8,1));
        JLabel user = new JLabel("账户 >>");
        user.setHorizontalAlignment(JLabel.CENTER);
        user.setFont(new Font("幼圆", Font.BOLD, 24));
        JTextField userF = new JTextField();
        userF.setFont(new Font("幼圆", Font.BOLD, 24));
        userF.setForeground(Color.BLUE);
        userF.setHorizontalAlignment(JTextField.CENTER);

        JLabel password = new JLabel("密码 >>");
        password.setHorizontalAlignment(JLabel.CENTER);
        password.setFont(new Font("幼圆", Font.BOLD, 24));

        JPasswordField passwordF = new JPasswordField();
        passwordF.setHorizontalAlignment(JTextField.CENTER);


        JLabel tit2 = new JLabel("<< 默认账户密码都是admin >>");
        tit2.setHorizontalAlignment(JLabel.CENTER);
        tit2.setFont(new Font("幼圆", Font.BOLD, 20));
        tit2.setForeground(Color.magenta);
        JLabel air2 = new JLabel("");
        jp.add(tit2);
        jp.add(user);
        jp.add(userF);
        jp.add(air2);
        jp.add(password);
        jp.add(passwordF);
        loginFrame.getContentPane().add(jp,BorderLayout.CENTER);


        JButton loginButton = new JButton("登录");
        loginButton.setFont(new Font("幼圆", Font.BOLD, 20));
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //这里占时先用默认密码成功

                String userName = userF.getText();
                String password = passwordF.getText();
                if(userName.equals("admin") && password.equals("admin")){

                    JOptionPane.showMessageDialog(loginFrame, "登录成功");
                    goodsManager gm = new goodsManager();
//                gm.setVisible(true);
                    loginFrame.setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(loginFrame, "登录失败，请重新输入");

                }


            }
        };

        loginButton.addActionListener(actionListener);


        loginFrame.getContentPane().add(loginButton,BorderLayout.SOUTH);
//        loginButton.setBounds(150, 200, 50, 10);
//        设置边框
        jp.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0),10));



        loginFrame.setVisible(true);
    }
}