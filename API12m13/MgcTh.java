package API12m13;

import java.util.Scanner;

public class MgcTh {
//    String replace(旧值，新值)
//    只有返回值才是替换的结果
public static void main(String[] args) {
//    获取
    Scanner sc = new Scanner(System.in);
    System.out.println("请发送一条消息");
    String talk =sc.next();
//    定义一个敏感词库
    String[] arr = {"TMD","SB","CNM"};
//    循环判断
    for (int i = 0; i < arr.length; i++) {
        talk = talk.replace(arr[i], "***");
    }
    System.out.println(talk);

//    替换
//    String result = talk.replace("TMD", "***");
//    System.out.println(result);
}
}
