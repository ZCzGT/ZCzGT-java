package ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        JFrame gameframe = new JFrame("拼图小游戏");
        gameframe.setSize(603,680);
        gameframe.setVisible(true);
//        gameframe.show();
        //登录界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        //注册界面

        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);

    }
}
