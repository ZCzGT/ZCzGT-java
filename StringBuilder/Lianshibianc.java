package StringBuilder;

import java.util.Scanner;

public class Lianshibianc {
    public static void main(String[] args) {
        //链式编程
        //调用方法时候，不需要用变量接收结果，可以继续调用其他方法

//        String s =
//        int len = getString().substring(1).replace("A", "Q").length();//因为是RT是字符串,可如此
//        System.out.println(len);

        StringBuilder sb = new StringBuilder();
//        sb.append("aaa");//返回Stirngbuilder
        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);
    }


    public static String getString() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}
