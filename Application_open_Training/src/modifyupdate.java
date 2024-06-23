import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class modifyupdate extends JFrame {
    List<Goods> goodsList = goodsManager.getGoods();
    private JTextField goodsIdF;
    private JTextField goodsNameF;
    private JTextField goodsPriceF;
    private JTextField goodsAmountF;

    public modifyupdate(int id) {
        UIManager.put("Label.font", new Font("宋体", Font.BOLD, 28));


        setTitle("--查询结果请修改--");

        // 设置窗口居中
        int width = 800;
        int height = 800;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - width) / 2, (screenSize.height - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("-----查询结果请修改-----");
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
        jp.setLayout(new GridLayout(9, 2));

        JLabel t1 = new JLabel("Id");
        JLabel t1a = new JLabel(id + "");
        t1a.setForeground(Color.BLUE);
        JLabel goodsId = new JLabel("修改的商品id >>");
        goodsIdF = new JTextField();
        goodsIdF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsIdF.setForeground(Color.BLUE);
        goodsIdF.setHorizontalAlignment(JTextField.CENTER);

        JLabel t2 = new JLabel("商品名字");
        JLabel t2a = new JLabel(target.getName());
        t2a.setForeground(Color.BLUE);
        JLabel goodsName = new JLabel("修改的商品名称  >>");
        goodsNameF = new JTextField();
        goodsNameF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsNameF.setForeground(Color.BLUE);
        goodsNameF.setHorizontalAlignment(JTextField.CENTER);

        JLabel t3 = new JLabel("商品价格");
        JLabel t3a = new JLabel(target.getPrice() + "");
        t3a.setForeground(Color.BLUE);
        JLabel goodsPrice = new JLabel("修改的商品价格  >>");
        goodsPriceF = new JTextField();
        goodsPriceF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsPriceF.setForeground(Color.BLUE);
        goodsPriceF.setHorizontalAlignment(JTextField.CENTER);

        JLabel t4 = new JLabel("商品数量");
        JLabel t4a = new JLabel(target.getAmount() + "");
        t4a.setForeground(Color.BLUE);
        JLabel goodsAmount = new JLabel("修改的商品个数  >>");
        goodsAmountF = new JTextField();
        goodsAmountF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsAmountF.setForeground(Color.BLUE);
        goodsAmountF.setHorizontalAlignment(JTextField.CENTER);
        JButton modifyButton = new JButton("提交信息");
        modifyButton.setFont(new Font("宋体", Font.BOLD, 24));
        JLabel line = new JLabel("==========点击下方");
        JLabel line2 = new JLabel("提交数据==========");
        line.setHorizontalAlignment(JLabel.RIGHT);
        line.setFont(new Font("幼圆", Font.BOLD, 24));
        line2.setHorizontalAlignment(JLabel.LEFT);
        line2.setFont(new Font("幼圆", Font.BOLD, 24));

        jp.add(t1);
        jp.add(t1a);
        jp.add(goodsId);
        jp.add(goodsIdF);
        jp.add(t2);
        jp.add(t2a);
        jp.add(goodsName);
        jp.add(goodsNameF);
        jp.add(t3);
        jp.add(t3a);
        jp.add(goodsPrice);
        jp.add(goodsPriceF);
        jp.add(t4);
        jp.add(t4a);
        jp.add(goodsAmount);
        jp.add(goodsAmountF);
        jp.add(line);
        jp.add(line2);

        JButton addButton = new JButton("提交信息");
        addButton.setFont(new Font("宋体", Font.BOLD, 24));
        getContentPane().add(addButton, BorderLayout.SOUTH);

        getContentPane().add(jp, BorderLayout.CENTER);
        setVisible(true);

        Goods finalTarget = target;
        ActionListener actionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (goodsIdF.getText().equals("") || goodsNameF.getText().equals("") || goodsPriceF.getText().equals("") || goodsAmountF.getText().equals("")) {
            //这个是用于判断是否有空参数
            JOptionPane.showMessageDialog(null, "Error 请输入完整信息");
        } else if (Integer.parseInt(goodsIdF.getText()) <= 0 || Double.parseDouble(goodsPriceF.getText()) <= 0 || Integer.parseInt(goodsAmountF.getText()) <= 0) {
            //这个是用来判断填写id数量价格不是负数
            JOptionPane.showMessageDialog(null, "Error 数据不能为负数");
        } else {


            int goodsId = Integer.parseInt(goodsIdF.getText());
            String goodsName = goodsNameF.getText();
            double goodsPrice = Double.parseDouble(goodsPriceF.getText());
            int goodsAmount = Integer.parseInt(goodsAmountF.getText());
            Goods goods1 = new Goods(goodsId, goodsName, goodsPrice, goodsAmount);
            goodsList.add(goods1);
            goodsList.remove(finalTarget);
            JOptionPane.showMessageDialog(null, "修改成功");


        }

    }
};


        addButton.addActionListener(actionListener);


    }
}





