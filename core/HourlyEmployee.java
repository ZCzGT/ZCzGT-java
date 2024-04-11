package core;

public class HourlyEmployee extends Employee{
    private double Hourmonehy;
    private int hour;
    public HourlyEmployee(String name, int tsmonth,double Hourmonehy,int hour) {
        super(name, tsmonth);
        this.Hourmonehy = Hourmonehy;
        this.hour = hour;
    }

    @Override
    public double getSalary(int month) {
        double total = 0;
        //判断
        if (hour > 160){
//            后者为超出1.5倍工资
            total = Hourmonehy*160 +Hourmonehy*1.5*(hour - 160);
        }
//        生日
        if (month == getTsmonth()){
            return total+100;
        }
        return total;
    }

    public double getHourmonehy() {
        return Hourmonehy;
    }

    public void setHourmonehy(double hourmonehy) {
        Hourmonehy = hourmonehy;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
