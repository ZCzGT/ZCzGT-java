package test;

import core.*;

public class Employeeshow {
    public static void main(String[] args) {
        int month = 5;//设置当前月份
        Employee[] employee = {
                new SalariedEmployee("张三",7,9000),
                new HourlyEmployee("李四",5,20,180),
                new SalesEmployee("陈五",5,100000,0.1),
                new BasePlusSalesEmployee("刑六",3,100000,0.05,3000)


        };
        for (Employee emp:employee
             ) {
            System.out.println("姓名:  "+emp.getName()+" 生日  "+emp.getTsmonth()+"月 工资  "+emp.getSalary(5));
        }
    }

}
