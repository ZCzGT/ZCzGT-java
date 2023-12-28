import java.util.Scanner;

public class dist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个坐标");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("请输入第二个坐标");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dis = dis(x1,y1,x2,y2);
        System.out.println("两点距离为" + dis);
    }

    public static double dis(double x1,double y1,double x2,double y2){
        double dis;

        dis = Math.sqrt((y2-y1)*(y2-y1) +(x2-x1)*(x2-x1));
        return dis;
    }
}
