package API12m13;

public class Shojihaopingbi {
    public static void main(String[] args) {

//        String substring(int beginIndex,int endIndex)
//        截取包头不包尾包左不包→
//        String substring(int beginIndex)
//        截取到尾巴
//        获取手机号
//
    String pNumber = "12345678912";
    String string = pNumber.substring(0,3);//只截取返回值
    String string2 = pNumber.substring(7);//
String result = string +"****"+ string2;
    System.out.println(result);

    }
}
