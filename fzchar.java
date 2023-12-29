package API12m13;

import java.util.Scanner;

public class fzchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        String result = fzString(s);
        System.out.println("反转的字符串为" + "→ "+result);

    }
    //反转字符串
    public static String fzString(String str){
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            temp = temp + c;
        }
        return temp;

    }
}
