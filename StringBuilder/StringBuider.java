package StringBuilder;

public class StringBuider {
    public static void main(String[] args) {


//    提高字符串操作效率
//    public StringBuilder() //本身就是容器
//    public StringBuilder(String str)
//    StringBuilder sb = new StringBuilder()
//    StringBuilder sb = new StringBuilder("abc")

//  成员方法
//    public StringBuilder append(任意类型) 添加数据 返回对象本身
//    public StringBuilder reverse() 反转容器中的内容
//    public int length() 返回长度
//    public String toString() 可以将容器里面的内容变成String
//对象
        StringBuilder sb = new StringBuilder("abc");
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);

//        sb.reverse();

//        System.out.println(sb.length());

        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
//打印
//    因为sb是java已经写好的
//    打印对象不是地址值而不是属性
        System.out.println(sb);//sb不是字符串
        //再转成字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
