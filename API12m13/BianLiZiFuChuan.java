package API12m13;

import java.util.Scanner;

public class BianLiZiFuChuan {
    public static void main(String[] args) {
//        遍历字符串
//        public char charAt(int index)根据索引返回字符串

//        public int length() 字符串长度

//      Q  键盘录入字符串并且遍历
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
//        for (int i = 0; i < str.length(); i++) {
////            i以此表示字符串的索引
//            char c = str.charAt(i);
//            System.out.println(c);
//        }

//        Q 统计字符串个数 区分类型
        int small = 0;
        int big = 0;
        int number  = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                small++;
            } else if (c >= 'A' && c <= 'Z') {
                big++;
            }else if (c >= '0' && c <= '9') {
                number++;
            }

        }
        System.out.println("小写字母有"+small+"个");
        System.out.println("大写字母有"+big+"个");
        System.out.println("数字字母有"+number+"个");
    }
}
