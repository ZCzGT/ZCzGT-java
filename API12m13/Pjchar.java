package API12m13;

public class Pjchar {
    public static void main(String[] args) {
    int[] arr = {1,2,3};

    String str = A(arr);
    System.out.println(str);
    }
    public static String A(int[] arr){
//安全校验
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
        return "[]";
        }
//    其他的
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                result = result + arr[i] + ',';
            }else result = result + arr[i];
        }
    return result+"]";

    }
}
