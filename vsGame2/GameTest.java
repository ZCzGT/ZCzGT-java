package vsGame2;

public class GameTest {
    public static void main(String[] args) {


        Role r1 = new Role("杰杰",60,'男');
        Role r2 = new Role("小怪",60,'男');
//展示信息
        r1.showRoleinfo();
        r2.showRoleinfo();

        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0 ){
                System.out.println(r1.getName()+"WIN");
            break;
            }
           r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"WIN");
            break;
            }
        }


    }
}
