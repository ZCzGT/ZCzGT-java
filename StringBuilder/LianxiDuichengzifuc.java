package StringBuilder;

import java.util.Scanner;

public class LianxiDuichengzifuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String s = new StringBuilder().append(str).reverse().toString();

        if (str.equals(s)){
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }

    }

}
