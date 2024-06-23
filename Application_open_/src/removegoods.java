import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class removegoods extends JFrame {
//    这个类是用来删除商品的



    public removegoods() throws HeadlessException {
        setTitle("--删除商品--");

        //设置居中
        int width = 600;
        int height = 600;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenwidth = tk.getScreenSize().width;
        int screenheight = tk.getScreenSize().height;
        setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JLabel titleLabel = new JLabel("[ADMIN] 请删除商品");
//        JLabel titleLabelOpp = new JLabel("请注意操作不可逆!!!");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
        titleLabel.setForeground(Color.blue);
        getContentPane().add(titleLabel, BorderLayout.NORTH);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(6,1));
        JLabel removegoodsId = new JLabel("请输入你要删除的Id >>");
        removegoodsId.setHorizontalAlignment(JLabel.CENTER);
        removegoodsId.setFont(new Font("幼圆", Font.BOLD, 24));
        JTextField removegoodsIdF = new JTextField();
        removegoodsIdF.setFont(new Font("幼圆", Font.BOLD, 24));
        removegoodsIdF.setForeground(Color.BLUE);
        removegoodsIdF.setHorizontalAlignment(JTextField.CENTER);
        JLabel titleLabelOpp = new JLabel("请注意操作不可逆!!!");
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
        jp.add(removegoodsId);
        jp.add(removegoodsIdF);
        jp.add(line);
        jp.add(line2);
        jp.add(line3);
        getContentPane().add(jp, BorderLayout.CENTER);

        JButton removegoodsB = new JButton("确定");
        removegoodsB.setFont(new Font("幼圆", Font.BOLD, 30));
        removegoodsB.setForeground(Color.blue);
        getContentPane().add(removegoodsB, BorderLayout.SOUTH);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int removegoodsId = Integer.parseInt(removegoodsIdF.getText());

                List<Goods> goodsList = goodsManager.getGoods();
                Goods target = null;
                for (Goods goods : goodsList) {
                    if (goods.getId() == removegoodsId) {
                        target = goods;
                        break; // 找到后退出循环
                    }
                }

                if (target == null) {
                    // 处理未找到商品的情况
                    JOptionPane.showMessageDialog(null, "未找到ID为 " + removegoodsId + " 的商品", "删除失败", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                goodsList.remove(target);

                JOptionPane.showMessageDialog(null, "成功删除ID为 >>"+removegoodsId +" << 商品"  );

            }
        };
        removegoodsB.addActionListener(actionListener);

        setVisible(true);
    }
}
