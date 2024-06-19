import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class querygoods extends JFrame   {
    public querygoods() throws HeadlessException {



//    这个类是用来删除商品的



                setTitle("--查询商品--");

                //设置居中
                int width = 600;
                int height = 600;
                Toolkit tk = Toolkit.getDefaultToolkit();
                int screenwidth = tk.getScreenSize().width;
                int screenheight = tk.getScreenSize().height;
                setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


                JLabel titleLabel = new JLabel("[ADMIN] 请查询商品");
//        JLabel titleLabelOpp = new JLabel("请注意操作不可逆!!!");
                titleLabel.setHorizontalAlignment(JLabel.CENTER);
                titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
                titleLabel.setForeground(Color.blue);
                getContentPane().add(titleLabel, BorderLayout.NORTH);

                JPanel jp = new JPanel();
                jp.setLayout(new GridLayout(6,1));
                JLabel querygoodsId = new JLabel("请输入你要查询的Id >>");
                 querygoodsId.setHorizontalAlignment(JLabel.CENTER);
                 querygoodsId.setFont(new Font("幼圆", Font.BOLD, 24));
                JTextField querygoodsIdF = new JTextField();
        querygoodsIdF.setFont(new Font("幼圆", Font.BOLD, 24));
        querygoodsIdF.setForeground(Color.BLUE);
        querygoodsIdF.setHorizontalAlignment(JTextField.CENTER);
                JLabel titleLabelOpp = new JLabel("请注意只支持ID唯一键查询(空集合无法查询)");
                titleLabelOpp.setFont(new Font("宋体", Font.BOLD, 25));
                titleLabelOpp.setHorizontalAlignment(JLabel.CENTER);
                titleLabelOpp.setForeground(Color.red);

                JLabel line = new JLabel("");
                JLabel line2 = new JLabel("==========点击下方按钮确定==========");
                line2.setHorizontalAlignment(JLabel.CENTER);
                line2.setFont(new Font("幼圆", Font.BOLD, 24));
                JLabel line3 = new JLabel("");
//        line3.setHorizontalAlignment(JLabel.CENTER);
//        line3.setFont(new Font("幼圆", Font.BOLD, 24));

                jp.add(titleLabelOpp);
                jp.add(querygoodsId);
                jp.add(querygoodsIdF);
                jp.add(line);
                jp.add(line2);
                jp.add(line3);
                getContentPane().add(jp, BorderLayout.CENTER);

                JButton queryButton = new JButton("确定");
        queryButton.setFont(new Font("幼圆", Font.BOLD, 30));
        queryButton.setForeground(Color.blue);
                getContentPane().add(queryButton, BorderLayout.SOUTH);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int getgoodsId = Integer.parseInt(querygoodsIdF.getText());
                queryanswer qa = new queryanswer(getgoodsId);
                qa.setVisible(true);
            }
        };

        queryButton.addActionListener( actionListener);


                setVisible(true);
            }

}



