package core;

public abstract class Employee {

    private String name;
    private int tsmonth;

    public Employee(String name, int tsmonth) {
        this.name = name;
        this.tsmonth = tsmonth;
    }


    public abstract double getSalary(int month);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTsmonth() {
        return tsmonth;
    }

    public void setTsmonth(int tsmonth) {
        this.tsmonth = tsmonth;
    }
}