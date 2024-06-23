import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class addgoods extends JFrame implements ActionListener {
//这个类是用来添加商品的

//    private static ArrayList<Goods> goods;
//
//    public static ArrayList<Goods> getGoods() {
//        return goods;
//    }
//
//    public void setGoods(ArrayList<Goods> goods) {
//        this.goods = goods;
//    }
List<Goods> goods = goodsManager.getGoods();
    private JTextField goodsIdF;
    private JTextField goodsNameF;
    private JTextField goodsPriceF;
    private JTextField goodsAmountF;

    public addgoods() throws HeadlessException {

        //这个面板是用来添加商品的;
        setTitle("--添加商品--");
//        goods = new ArrayList<>();
        //设置居中
        int width = 600;
        int height = 800;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenwidth = tk.getScreenSize().width;
        int screenheight = tk.getScreenSize().height;
        setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JLabel titleLabel = new JLabel("[ADMIN] 请添加商品");
//        JLabel titleLabelOpp = new JLabel("请注意操作不可逆!!!");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
        titleLabel.setForeground(Color.blue);
        getContentPane().add(titleLabel, BorderLayout.NORTH);


        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(10, 1));
        JLabel goodsId = new JLabel("商品id >>");
        goodsId.setHorizontalAlignment(JLabel.CENTER);
        goodsId.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsIdF = new JTextField();
        goodsIdF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsIdF.setForeground(Color.BLUE);
        goodsIdF.setHorizontalAlignment(JTextField.CENTER);

        JLabel goodsName = new JLabel("商品名称  >>");
        goodsName.setHorizontalAlignment(JLabel.CENTER);
        goodsName.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsNameF = new JTextField();
        goodsNameF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsNameF.setForeground(Color.BLUE);
        goodsNameF.setHorizontalAlignment(JTextField.CENTER);

        JLabel goodsPrice = new JLabel("商品价格  >>");
        goodsPrice.setHorizontalAlignment(JLabel.CENTER);
        goodsPrice.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsPriceF = new JTextField();
        goodsPriceF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsPriceF.setForeground(Color.BLUE);
        goodsPriceF.setHorizontalAlignment(JTextField.CENTER);

        JLabel goodsAmount = new JLabel("商品添加个数  >>");
        goodsAmount.setHorizontalAlignment(JLabel.CENTER);
        goodsAmount.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsAmountF = new JTextField();
        goodsAmountF.setFont(new Font("幼圆", Font.BOLD, 24));
        goodsAmountF.setForeground(Color.BLUE);
        goodsAmountF.setHorizontalAlignment(JTextField.CENTER);

        JButton addButton = new JButton("提交信息");
        addButton.setFont(new Font("宋体", Font.BOLD, 24));
        JLabel line = new JLabel("==========点击下方提交数据==========");
        line.setHorizontalAlignment(JLabel.CENTER);
        line.setFont(new Font("幼圆", Font.BOLD, 24));

        JLabel air = new JLabel("");

        addButton.addActionListener(this);
        jp.add(goodsId);
        jp.add(goodsIdF);
        jp.add(goodsName);
        jp.add(goodsNameF);
        jp.add(goodsPrice);
        jp.add(goodsPriceF);
        jp.add(goodsAmount);
        jp.add(goodsAmountF);
        jp.add(line);
        jp.add(addButton);
//        jp.add(air);

        getContentPane().add(jp);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        if (command.equals("提交信息")) {
            if (goodsIdF.getText().equals("") || goodsNameF.getText().equals("") || goodsPriceF.getText().equals("") || goodsAmountF.getText().equals("")) {
                //这个是用于判断是否有空参数
                JOptionPane.showMessageDialog(null, "Error 请输入完整信息");
            } else if (Integer.parseInt(goodsIdF.getText()) <= 0 || Double.parseDouble(goodsPriceF.getText()) <= 0 || Integer.parseInt(goodsAmountF.getText()) <= 0) {
                //这个是用来判断填写id数量价格不是负数
                JOptionPane.showMessageDialog(null, "Error 数据不能为负数");
            } else {
                //这个用来判断id唯一性

                int goodsIdc = Integer.parseInt(goodsIdF.getText());
                // 检查ID是否唯一
                for (Goods g : goods) {
                    if (g.getId() == goodsIdc) {
                        // 这个用来判断id唯一性
                        JOptionPane.showMessageDialog(null, "Id重复了哦，请重新输入");
                        return;
                    }
                }


                int goodsId = Integer.parseInt(goodsIdF.getText());
                String goodsName = goodsNameF.getText();
                double goodsPrice = Double.parseDouble(goodsPriceF.getText());
                int goodsAmount = Integer.parseInt(goodsAmountF.getText());
                Goods goods1 = new Goods(goodsId, goodsName, goodsPrice, goodsAmount);
                goods.add(goods1);
                JOptionPane.showMessageDialog(null, "添加成功");


            }


        }

    }
}
