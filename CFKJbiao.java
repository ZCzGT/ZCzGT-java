public class CFKJbiao {
    public static void main(String[] args) {
        int answer;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                answer = i * j ;
                System.out.print(j +"*"+i+"="+answer+" ");
            }
            System.out.println(" ");//用于换行
        }
    }
}
