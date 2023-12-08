import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ct = 1;
        int guess = r.nextInt(1,101);//或者100 +1
        System.out.println("你好欢迎来到猜数字小游戏(1-100)");
        System.out.println("下面请开始你的游戏");
        while (true) {
            System.out.println("这是你的第" + ct + "次猜数字");
            int youguess = sc.nextInt();
            if (youguess >100 || youguess<1){
                System.out.println("你输入的数字不合规,请重新输入");
                continue;
            }
                if (youguess > guess) {
                    System.out.println("不好意思你猜大了");
                } else if (guess > youguess) {
                    System.out.println("不好意思你猜小了");
                } else if (guess == youguess) {
                    System.out.println("恭喜你猜对了！你一共用了" + ct + "次");
                    break;
                }
                   ct++;
                if (ct == 8){
                    System.out.println("不好意思规定次数内你没能猜中");
                    try {
                        Runtime.getRuntime().exec("rundll32.exe user32.dll,LockWorkStation");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }




        }
    }
}
