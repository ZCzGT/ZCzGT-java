public class Goods {


    //    这里模拟的是商品
    private int Id;
    private String Name;
    private double Price;
    private int Amount;//数量

    public Goods(int id, String name, double price, int amount) {
        this.Id = id;
        this.Name = name;
        this.Price = price;
        this.Amount = amount;
    }


    public Goods() {
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    @Override
    public String toString() {
        return
                "商品ID=" + Id +
                        ",商品名='" + Name + '\'' +
                        ",商品价格 =" + Price +
                        ", 商品数量=" + Amount
                ;
    }

}
