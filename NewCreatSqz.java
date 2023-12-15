import java.util.Scanner;

public class NewCreatSqz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的高");
        int row = sc.nextInt();

        //使用高度便li

        for (int i = 1; i <= row; i++) {

            //便历数出空格
            for (int i1 = row-i; i1 > 0; i1--) {
                System.out.print(" ");
            }
            //用于便历处星号
            for (int k = 0; k <(i-1)*2+1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");//用于换行
        }
    }
}