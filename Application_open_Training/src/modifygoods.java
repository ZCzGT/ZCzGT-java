import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class modifygoods extends JFrame {
    public modifygoods() throws HeadlessException {
        setTitle("--修改商品信息商品--");

        //设置居中
        int width = 600;
        int height = 600;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenwidth = tk.getScreenSize().width;
        int screenheight = tk.getScreenSize().height;
        setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("[ADMIN] 请修改商品");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
        titleLabel.setForeground(Color.blue);
        getContentPane().add(titleLabel, BorderLayout.NORTH);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(6,1));
        JLabel modifygoodsID = new JLabel("请输入你要修改的的商品Id >>");
        modifygoodsID.setHorizontalAlignment(JLabel.CENTER);
        modifygoodsID.setFont(new Font("幼圆", Font.BOLD, 24));
        JTextField modifygoodsF = new JTextField();
        modifygoodsF.setFont(new Font("幼圆", Font.BOLD, 24));
        modifygoodsF.setForeground(Color.BLUE);
        modifygoodsF.setHorizontalAlignment(JTextField.CENTER);

        JLabel line = new JLabel("");
        JLabel line2 = new JLabel("==========点击下方按钮确定==========");
        line2.setHorizontalAlignment(JLabel.CENTER);
        line2.setFont(new Font("幼圆", Font.BOLD, 24));
        JLabel line3 = new JLabel("");
        JLabel titleLabelOpp = new JLabel("");
//        line3.setHorizontalAlignment(JLabel.CENTER);
//        line3.setFont(new Font("幼圆", Font.BOLD, 24));

        jp.add(titleLabelOpp);
        jp.add(modifygoodsID);
        jp.add(modifygoodsF);
        jp.add(line);
        jp.add(line2);
        jp.add(line3);
        getContentPane().add(jp, BorderLayout.CENTER);

        JButton modifyb = new JButton("确定");
        modifyb.setFont(new Font("幼圆", Font.BOLD, 30));
        modifyb.setForeground(Color.blue);
        getContentPane().add(modifyb, BorderLayout.SOUTH);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int modifygoodids = Integer.parseInt(modifygoodsF.getText());

                List<Goods> goodsList = goodsManager.getGoods();
                Goods target = null;


                modifyupdate ma = new modifyupdate(modifygoodids);
                ma.setVisible(true);


            }
        };
        modifyb.addActionListener(actionListener);
        setVisible(true);
    }
}
