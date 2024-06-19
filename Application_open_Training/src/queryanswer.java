import javax.swing.*;
import java.awt.*;
import java.util.List;

public class queryanswer extends JFrame {

    public queryanswer(int id) {
        UIManager.put("Label.font", new Font("宋体", Font.BOLD, 28));

        List<Goods> goodsList = goodsManager.getGoods();
        setTitle("--查询结果--");

        // 设置窗口居中
        int width = 600;
        int height = 600;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - width) / 2, (screenSize.height - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("-----查询结果-----");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
        titleLabel.setForeground(Color.blue);
        getContentPane().add(titleLabel, BorderLayout.NORTH);

        Goods target = null;
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                target = goods;
                break; // 找到后退出循环
            }
        }

        if (target == null) {
            // 处理未找到商品的情况
            JOptionPane.showMessageDialog(this, "未找到ID为 " + id + " 的商品", "查询失败", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(4, 2));

        JLabel t1 = new JLabel("Id");
        JLabel t1a = new JLabel(id + "");
        JLabel t2 = new JLabel("商品名字");
        JLabel t2a = new JLabel(target.getName());
        JLabel t3 = new JLabel("商品价格");
        JLabel t3a = new JLabel(target.getPrice() + "");
        JLabel t4 = new JLabel("商品数量");
        JLabel t4a = new JLabel(target.getAmount() + "");

        jp.add(t1);
        jp.add(t1a);
        jp.add(t2);
        jp.add(t2a);
        jp.add(t3);
        jp.add(t3a);
        jp.add(t4);
        jp.add(t4a);

        getContentPane().add(jp, BorderLayout.CENTER);
        setVisible(true);
    }


}