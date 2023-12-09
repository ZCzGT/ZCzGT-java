import java.util.Scanner;

public class FindMinGbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //记录两个数
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        //计算最大公约数
        int n3;
        int gys = 1;
        //记录最大值
        if(num1 > num2){
            n3 = num1;
        } else if (num2 > num1) {
            n3 = num2;
        } else {
            n3 = num1;
        }

        for (int i = 1; i <= n3; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                gys = i;
            }
        }

        //计算最小公倍数
        int gbs = num1 * num2 /gys;
        System.out.println(num1 + "和" + num2 + "的最小公倍数为"+ gbs);
    }
}
