package API12m13;

import java.util.Scanner;

public class UserJoin {
    public static void main(String[] args) {
        //模拟用户登陆
        String User1name = "ADMIN";
        String User1Password = "ADMIN";
        Scanner sc = new Scanner(System.in);
//        已知正确的用户名和密码

        int count = 0;
        for (int i = 0 ; i <3;i++) {

            System.out.println("请输入您的用户名");
            String username = sc.next();
            System.out.println("请输入你的密码");
            String userpassword = sc.next();

//
            boolean ansn = User1name.equals(username);
            boolean ansp = User1Password.equals(userpassword);
            if (ansn == true && ansp == true) {
                System.out.println("恭喜你登陆成功");
                break;
            } else {
                System.out.println("不好意思用户名或者密码不对,请再输入");
                count++;
                System.out.println("你还有"+(3-count)+"次机会");
                if (count == 3) {
                    System.out.println("输入超过了3次，账户"+username+"已经锁定请联系ADMIN");
                }

            }


        }

    }
}
