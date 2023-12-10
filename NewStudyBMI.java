import java.util.Scanner;
public class NewStudyBMI {
    public static void main(String[] args) {
        double BMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的体重(kg)");
        double tiz = scanner.nextDouble();
        System.out.println("请输入你的身高(m)");
        double shg = scanner.nextDouble();
        BMI = tiz/(shg*shg);
        if (BMI<19){
            System.out.println("不好意思你太瘦了");
        } else if (BMI>=19 && BMI<=27) {
            System.out.println("恭喜你你的体重正常0");
        } else if (BMI>27) {
            System.out.println("不好意思你过重了！！！！");
        }else {
            System.out.println("你输入的不规范！");
        }

    }
}
