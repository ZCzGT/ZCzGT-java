import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class goodsManager extends JFrame implements ActionListener {
    private static ArrayList<Goods> goods = new ArrayList<>();

    public static ArrayList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }
    //这里是商品管理界面

    public goodsManager() throws HeadlessException {
        UIManager.put("Button.font", new Font("幼圆", Font.BOLD, 20));
        setTitle("这里是货物管理员系统");
        //设置居中
        int width = 600;
        int height = 600;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int screenwidth = tk.getScreenSize().width;
        int screenheight = tk.getScreenSize().height;
        setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setUndecorated(true);

        JLabel titleLabel = new JLabel("欢迎你来到货物管理界面");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 30));
        titleLabel.setForeground(Color.pink);
        getContentPane().add(titleLabel, BorderLayout.NORTH);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

//        JLabel winJLabel = new JLabel(new ImageIcon("..\\Application_open_Training\\img.png"));
//        winJLabel.setBounds(0, 0, width, height);
//        getContentPane().add(winJLabel);
        JButton addButton = new JButton("添加货物");
        JButton deleteButton = new JButton("删除货物");
        JButton updateButton = new JButton("修改货物");
        JButton searchButton = new JButton("查询货物");
        JButton allgoodsButton= new JButton("所有商品");
        JButton LuckyButton2= new JButton("幸运按钮");

        LuckyButton2.setFont(new Font("宋体", Font.BOLD, 20));
        LuckyButton2.setForeground(Color.pink);
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        searchButton.addActionListener(this);
        allgoodsButton.addActionListener(this);
        LuckyButton2.addActionListener(this);


        JLabel air = new JLabel("<<请注意必须先添加货");
        air.setHorizontalAlignment(JLabel.RIGHT);
        air.setFont(new Font("宋体", Font.BOLD, 23));
        air.setForeground(Color.red);
        JLabel air2 = new JLabel("物否则无法使用功能>>");
        air2.setHorizontalAlignment(JLabel.LEFT);
        air2.setFont(new Font("宋体", Font.BOLD, 23));
        air2.setForeground(Color.red);
        panel.add(air);
        panel.add(air2);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(updateButton);
        panel.add(searchButton);
        panel.add(allgoodsButton);
        panel.add(LuckyButton2);

        getContentPane().add(panel);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String command = e.getActionCommand();
     if (command.equals("添加货物")){
         addgoods ads = new addgoods();
         ads.setVisible(true);
//         setVisible(false);
     } else if ( command.equals("删除货物")){
         removegoods rmg = new removegoods();
         rmg.setVisible(true);
     } else if ( command.equals("查询货物")){
         querygoods qgs = new querygoods();
         qgs.setVisible(true);
     }else if (command.equals("修改货物")){
         modifygoods mgs = new modifygoods();
         mgs.setVisible(true);
     }else if (command.equals("所有商品")){

//         Allgoods ags = new Allgoods();
//         ags.setVisible(true);
        Moder moder = new Moder();
         JTable record = new JTable(moder);
         JDialog dialog = new JDialog(goodsManager.this,true);
         dialog.setTitle("all goods");
         int width = 600;
         int height = 600;
         Toolkit tk = Toolkit.getDefaultToolkit();
         int screenwidth = tk.getScreenSize().width;
         int screenheight = tk.getScreenSize().height;
         dialog.setBounds ((screenwidth - width) / 2, (screenheight - height) / 2, width, height);


         dialog.getContentPane().setLayout(new BorderLayout());
         dialog.getContentPane().add(record,BorderLayout.CENTER);
         dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
         dialog.setVisible(true);
     }else if (command.equals("幸运按钮")){
         LuckyEgg le = new LuckyEgg();
         le.setVisible(true);
     }




    }
    class Moder implements TableModel {
        List<Goods> goodsList = goodsManager.getGoods();

        private String[] columName = {"ID","名字","价格","数量"};

        @Override
        public int getRowCount() {
            return goodsList.size();
        }
        @Override
        public int getColumnCount() {
            return columName.length;
        }
        @Override
        public String getColumnName(int columnIndex) {
            return columName[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex) {
                case 0: {
                    return Integer.class;
                }
                case 1:{
                    return String.class;
                }
                default:{
                    return Integer.class;
                }
            }
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Goods goods = goodsList.get(rowIndex);

            switch (columnIndex) {
                case 0: {
                    return goods.getId();
                }
                case 1: {
                    return goods.getName();
                }
                case 2: {
                    return goods.getPrice();
                }
                case 3: {
                    return goods.getAmount();
                }
            }
            return null;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        }

        @Override
        public void addTableModelListener(TableModelListener l) {

        }

        @Override
        public void removeTableModelListener(TableModelListener l) {

        }
    }
}



