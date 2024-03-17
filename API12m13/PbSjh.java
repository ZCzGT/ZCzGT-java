package API12m13;
//import java.util.Scanner;

public class PbSjh {
    //New方法
//    String substring(int beginIndex,int endIndex)
//    包头不包尾，包左不包右
//    只有返回值才是截取的小串
//    String substring(int beginIndex) 截取到末尾
    public static void main(String[] args) {


//    Scanner sc = new Scanner(System.in);
//    System.out.println("请输入一个电话号码");
//    String phoneNumber = sc.next();
        String phoneNumber = "12345678909";
        String start = phoneNumber.substring(0, 3);

        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);

    }


}

