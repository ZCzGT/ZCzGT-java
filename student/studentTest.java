package student;
// 小练习
public class studentTest {
    public static void main(String[] args) {


    student[] arr = new student[3];

    student std1 = new student(1,"张三",19);
    student std2 = new student(2,"李四",20);
    student std3 = new student(3,"王五",21);

    arr[0] = std1;
    arr[1] = std2;
    arr[2] = std3;

//    Q3通过ID删除学生信息
//        如果存在加不存在不加
//       int index =  findIndex(arr,2);
////        System.out.println(index);
////        存在删除
//        if(index>=0){
//            arr[index] = null;
//            printArr(arr);
//        }else{
////            删除失败
//            System.out.println("删除失败");
////            printArr(arr);
//        }

//        Q5查询并增加年龄
        int index2 = findIndex(arr,2);//找到索引
        if(index2 >=0){
//            存在年龄加
            student std = arr[index2];
            int Age = std.getAge() + 1;
            std.setAge(Age);
//            便历
            printArr(arr);
        }else{
            System.out.println("你查找的id不存在");
        }


    //Q1再次添加一个学生对象并且添加的时候进行学号的唯一判断

        student std4 = new student(4,"小六",22);
        boolean flag = pd(arr, std4.getId());//唯一性判断
        //添加入数组
        if (flag){
//            存在
            System.out.println("对不起当前ID已经存在");
        }else{
//            添加
//            判断存没存满
            int count = getcount(arr);
            if (count == arr.length){
//                满了
//创建新的数组
               student[] newArr = newarr(arr);
//               [s1 s2 s3 null]
                newArr[count] = std4;
//Q2遍历
//                printArr(newArr);


            }else{
//              没满
//                添加数据可以添加到count这个索引
                arr[count] = std4;
//                printArr(arr);
            }
        }




    }

    public static int findIndex(student[] arr,int id){

        for (int i = 0; i < arr.length; i++) {
            student s = arr[i];
            if(s !=null){
                int sid = s.getId();
                     if(sid == id) {
                     return i;
                }
            }
        }
//        循环结束没找到就没有
        return -1;

    }
//遍历
    public static void printArr(student[] arr){
        for (int i = 0; i < arr.length; i++) {
            student student = arr[i];

            if(student != null){
//            非空判断
                System.out.println(student.getId()+","+student.getName()+","+student.getAge());
            }
        }
    }

//    新的数组
    public static student[] newarr(student[] arr){
        student[] newArr = new student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
//            老数组添加进入新的数组
           newArr[i] = arr[i];
        }
        return newArr;

    }

//    判断存没存
    public static int getcount(student[] arr){
    int count = 0;//计数
//         如果没存就是null
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }
    //唯一性判断
//    1.要干嘛
//    2.干什么需要什么完成 【数组 id】
//    3.调用是否需要方法的结果 需要返回 boolean
    public static  boolean pd(student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];//记录
//            加一个非空判断
            if (stu != null) {
                //拿出id
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        //比完了才能写
        return false;

    }
}
