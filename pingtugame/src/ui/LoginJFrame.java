package ui;

import javax.swing.*;

//登录界面
public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);
        this.setVisible(true);

        this.setTitle("拼图 登录");
        //置顶(指窗口层)
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(3);


        //显示出来
        this.setVisible(true);
    }
}
