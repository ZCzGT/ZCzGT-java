import java.util.Scanner;

public class jeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();

        if (num<0 || num>9999999){
            System.out.println("不好意思你输入的不正确");
        }
        else {
            String result = jeEX(num);
            System.out.print("金额为"+result);
        }

    }
    //金额转化
    //查表法
    //只判断7位
    public static String jeEX(int chs){
        String[] BigC = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] Dw = {"佰","拾","万","仟","佰","拾","元"};
        String result  = "";
        int count = 0;
        int Cc =chs;
        while(chs>0){
            chs = chs/10;
            count++;
        }
        int js0 = 7-count;
//        组装数字
        for (int i = 0; i < count; i++) {
            int index = Cc %10;
            Cc /=10;
            result = BigC[index] + result ;
        }
        //添加头部零

        for (int i = 0; i < js0; i++) {
            result = "零" + result;
        }

//       添加单位
        String getA ="";
        for (int i = 0; i < Dw.length; i++) {
            getA = getA + result.charAt(i) +Dw[i];
        }


    return getA;

    }
}
