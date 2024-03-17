package API12m13;

public class Stringbijiao {
    public static void main(String[] args) {
//        应用比较的是地址值
//        可以用以下方法
//        boolean equals 比较字符串
//        boolean equalsIgnoreCase  比较字符串(忽略大小写)
//        EG
        String s1 =  new String("abc");
        String s2 = "Abc";
//        如果用==
        System.out.println(s1 == s2);

//        比较字符串当中的内容
        boolean result = s1.equals(s2);
//        区分大小写
        System.out.println(result);

        boolean result1 = s1.equalsIgnoreCase(s2);
        System.out.println(result1);

    }
}
