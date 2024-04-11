package core;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double based;
    public BasePlusSalesEmployee(String name, int tsmonth, double mouthsale, double salelv,double based) {
        super(name, tsmonth, mouthsale, salelv);
        this.based = based;
    }
    @Override
    public double getSalary(int month) {
        if (month == getTsmonth()) {
        return based+getMouthsale()*getSalelv() +100;
        }
        return based+getMouthsale()*getSalelv();
    }

    public double getBased() {
        return based;
    }

    public void setBased(double based) {
        this.based = based;
    }
}
