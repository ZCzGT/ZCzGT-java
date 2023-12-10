package vsGame2;

import java.util.Random;

public class Role {
    private String name;
    private int Blood;
    private char gender;
    private String face;//长相随机
    //长相数组
    String[] boyface = {"相貌英俊", "五官端正", "平平无奇","NoFace"};
    String[] girlface = {"美奂绝伦", "亭亭玉立", "平平无奇","NoFace"};
    String[] attack={
            "%s用了[Magic],击中了%s的-体 产生%d伤害",
            "%s轻轻一打,暴击了%s 产生%d伤害",
            "%s大叫一声,%s感到痛苦 产生%d伤害",
            "%s拿出[橘子]丢向了%s 产生%d伤害",
            "%s拿出[手机]给%s玩 产生%d伤害",
            "%s用处浑身解数用力刺向了%s 产生了暴击打出了%d伤害"
    };
    String[] injure={
            "%s被吓到了 还有%d血",
            "%s十分的痛苦 还有%d血",
            "%s感觉很轻松 还有%d血",
            "%s尖叫一声，痛苦捂住伤口 还有%d血",
            "%s摇摇晃晃感到痛苦 还有%d血",
            "%s痛苦的倒下了 还有%d血"
    };
    public Role(){}
    public Role(String name, int blood, char gender) {
        this.name = name;
        Blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相随机
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyface.length);
            this.face = boyface[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlface.length);
            this.face = girlface[index];
        } else {
            this.face = "NoFace(没有face)";
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return Blood;
    }

    public void setBlood(int blood) {
        Blood = blood;
    }

    //攻击方法
    public void attack(Role role) {
        Random r = new Random();
//  计算伤害
        int Damage = r.nextInt(40) + 1;
//      changeBlood
        int remainBlood = role.Blood - Damage;
//    检查负数
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
//
        role.setBlood(remainBlood);
        //攻击效果
        if(Damage <30) {
            int index = r.nextInt(0, attack.length - 1);
            String gj = attack[index];
            System.out.printf(gj, this.getName(), role.getName(), Damage);
            System.out.println(" ");
        } else if (Damage >=30) {
            String gj = attack[5];
            System.out.printf(gj, this.getName(), role.getName(), Damage);
            System.out.println(" ");
        }

//受伤
        if (remainBlood > 0) {
            int index2 = r.nextInt(0, injure.length-1);
            String ss = injure[index2];
            System.out.printf(ss, role.getName(), remainBlood);
            System.out.println(" ");
        } else if (remainBlood ==  0){
            System.out.printf(injure[5], role.getName(), remainBlood);
            System.out.println(" ");
        }
//        也可以改成IF判断
    }

    public void showRoleinfo() {
        System.out.println("姓名为" + getName());
        System.out.println("血量为" + getBlood());
        System.out.println("性别为" + getGender());
        System.out.println("长相为" + getFace());
    }
}

