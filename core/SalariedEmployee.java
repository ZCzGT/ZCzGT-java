package core;


public class SalariedEmployee extends Employee{

    private double monthsalary ;
    public SalariedEmployee(String name, int tsmonth,double monthsalary  ) {
        super(name, tsmonth);
        this.monthsalary = monthsalary;
    }
    @Override
    public double getSalary(int month) {
        if (month == getTsmonth()){
            return monthsalary+100;
        }
        return monthsalary ;
    }

    public double getMonthsalary() {
        return monthsalary;
    }

    public void setMonthsalary(double monthsalary) {
        this.monthsalary = monthsalary;
    }
}