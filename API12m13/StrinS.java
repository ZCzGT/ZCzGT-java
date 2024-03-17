package API12m13;

public class StrinS {
    public static void main(String[] args) {
//        System.out.println("Hello"+"World");

//        String name = "小";
//        String nameS = "杰";
//        System.out.println(name+nameS);//一共产生了三个字符串

// String的两种方式
//        1.String关键字 2 public String...
//        USE1
        String s1 = "abc";
        System.out.println(s1);
//        USE2 new
        String s2 = new String();
        System.out.println("1@"+s2+"@2");
        String s3 = new String("abc");
        System.out.println(s3);

        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);
//        用法
//        abc-->Qbc
//        abc-->{a,b,c}-->{Q,b,c}

//        传递字节数组
        byte[] bytes = {97,98,99,100};
        String s5 =new String(bytes);
        System.out.println(s5);

//        String s6 = "abc";
//        String s7 = "abc";//复用地址 //减少浪费内存
        char[] chss = {'a','b','c'};
        String r1 =new String(chss);//每new一次开一个新的空间
        String r2 =new String(chss);//与上面不一样


    }
}
