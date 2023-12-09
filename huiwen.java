import java.util.Scanner;
public class huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = sc.nextInt();
        int end = 0;
        while (num != 0 ){
            int ge = num % 10; //拿出个位
            num = num/10; //去掉个位
            end = end * 10 +ge;//
        }
        System.out.println("它的回文数为"+end);
    
    }
}