package StringJoineR;
import java.util.StringJoiner;//需要导包

public class StringJoineR {

//    容器
//    JDk8出现

//    构造方法

//public StringJoiner(间隔符号)
//    public StringJoiner(间隔符号,开始符号，结束符号)

//    成员方法
//    public StringJoiner add(添加的内容)
//    public StringJoiner length()
//    toString
public static void main(String[] args) {
    StringJoiner sj = new StringJoiner(",","[","]");
    sj.add("aaa").add("bbb").add("ccc").toString();

    System.out.println(sj.length());
//    空格也算入length
    System.out.println(sj);

}
}
