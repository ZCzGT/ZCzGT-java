import java.util.Scanner;

public class Fablacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Fablacci数组的位数");
        int n = sc.nextInt();//位数

        int[] Fab = new int[n];
        //用于判断n<3的办法

        if (n<3){
            for (int i = 0; i < n; i++) {
                Fab[i] = 1;
            }

        }else if (n>=3){
            for (int i = 0; i < 2; i++) {
                Fab[i] = 1;
            }
            //用于计算３位及以后的
            for (int i = 2; i < Fab.length; i++) {
                Fab[i] = Fab[i-1] + Fab[i-2];

            }
        }

        //便厉

        for (int i = 0; i < Fab.length; i++) {
            System.out.print(Fab[i] + "　");
        }
    }
}

