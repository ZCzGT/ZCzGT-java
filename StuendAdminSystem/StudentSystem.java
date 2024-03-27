package StuendAdminSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
    StudentSystemshow();
    }

    public static void StudentSystemshow() {
        ArrayList list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       loop: while (true) {
            System.out.println("----------欢迎来到ZW学生管理系统----------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出系统");
            System.out.println("请选择操作:");
            String index = sc.next();

            switch (index) {
                case "1": {
                    addStudent(list);

                    break;
                }
                case "2": {
                    removeStudent(list);

                    break;
                }
                case "3": {
                 updateStudent(list);
                    break;
                }
                case "4": {
                    queryStudent(list);

                    break;
                }
                case "5": {
                    System.out.println("退出中...");

                    break loop;
//                    System.exit(0);//停止虚拟机运行
                }
                default: {
                    System.out.println("不好意思不存在此选择");
                }
            }
        }
    }

    //添加学生方法
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        //要求id唯一

        System.out.println("请输入学生id");
        String id = sc.next();
        for (Student slist:list){
            if (slist.getId().equals(id)){
                System.out.println("错误！id重复");
                return;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生地址");
        String address = sc.next();
        Student st = new Student(id,name,age,address);
        list.add(st);
        System.out.println("添加成功");

    }
    //删除学生方法
//    for (int i = 0; i < list.size(); i++) {
//        Student slist = list.get(i);
//        if (slist.getId().equals(id)) {
//            list.remove(i);
//            break;
//        }
//    }
    public static void removeStudent(ArrayList<Student> list){
        Scanner sc  =new Scanner(System.in);
        System.out.println("请输入你要删除的学生id:");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++){
            Student slist = list.get(i);
            if(slist.getId().equals(id)){
                list.remove(i);
                System.out.println("删除成功！");
                return;
            }

        }
        System.out.println("错误！没有这个id用户");
    }
    //修改学生方法
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的id");
        String sid = sc.next();

        for (Student slist:list){
            if (slist.getId().equals(sid)){
                System.out.println("存在此学生请修改");
                System.out.println("请修改学生姓名");
                String sname = sc.next();
                slist.setName(sname);
                System.out.println("请修改学生年龄");
                int sage = sc.nextInt();
                slist.setAge(sage);
                System.out.println("请修改学生地址");
                String saddress = sc.next();
                slist.setAddress(saddress);
                System.out.println("修改完毕");
                return;
            }
        }
        System.out.println("无法查找到此学生！");

    }
    //查询学生方法
    public static void queryStudent(ArrayList<Student> list){

        if (list.size() == 0){
            System.out.println("错误！没有用户请添加");
            return;
        }

        System.out.println("id\t\t姓名\t年龄\t地址\t");
        for (Student slist:list) {
            System.out.println(slist.getId()+"\t\t"+slist.getName()+"\t"+slist.getAge()+"\t"+slist.getAddress());
        }
    }
}




