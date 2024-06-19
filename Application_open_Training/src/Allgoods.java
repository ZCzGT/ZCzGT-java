import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.List;

public class Allgoods extends JFrame {
    List<Goods> goodsList = goodsManager.getGoods();
    public Allgoods() throws HeadlessException {
        Moder moder = new Moder();
        JTable record = new JTable(moder);
        JDialog dialog = new JDialog(Allgoods.this,true);
        dialog.setTitle("all goods");
        dialog.setSize(500,500);
        dialog.getContentPane().setLayout(new BorderLayout());
        dialog.getContentPane().add(record,BorderLayout.CENTER);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);

//        //设置居中
//        int width = 500;
//        int height = 500;
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int screenwidth = tk.getScreenSize().width;
//        int screenheight = tk.getScreenSize().height;
//        setBounds((screenwidth - width) / 2, (screenheight - height) / 2, width, height);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//
//        setVisible(true);

    }

    class Moder implements TableModel{
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
                } default:{
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

