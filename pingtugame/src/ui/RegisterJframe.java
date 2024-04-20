package ui;

import javax.swing.*;

//注册界面
public class RegisterJframe extends JFrame {
    public RegisterJframe(){
        this.setSize(488,500);
        this.setVisible(true);

        this.setTitle("拼图 注册");
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
