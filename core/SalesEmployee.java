package core;

public class SalesEmployee extends Employee{
    private double mouthsale;
    private double salelv;
    public SalesEmployee(String name, int tsmonth,double mouthsale,double salelv) {
        super(name, tsmonth);
        this.mouthsale = mouthsale;
        this.salelv =salelv;
    }

    @Override
    public double getSalary(int month) {
        if (month == getTsmonth()){
            return mouthsale*salelv+100;
        }
        return mouthsale*salelv;
    }

    public double getMouthsale() {
        return mouthsale;
    }

    public void setMouthsale(double mouthsale) {
        this.mouthsale = mouthsale;
    }

    public double getSalelv() {
        return salelv;
    }

    public void setSalelv(double salelv) {
        this.salelv = salelv;
    }
}
