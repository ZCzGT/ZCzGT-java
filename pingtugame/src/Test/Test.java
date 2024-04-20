package Test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //打乱
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;

        }
        //便利
//        for (int i = 0; i < tempArr.length; i++) {
//            System.out.print(tempArr[i] +" ");
//        }

        int[][] data = new int[4][4];

        for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4] = tempArr[i ];
        }
//        遍历
        for (int i = 0; i < data.length; i++) {
            for (int i1 = 0; i1 < data[i].length; i1++) {
                System.out.print(data[i][i1] + " ");
            }
            System.out.println(" ");
        }
    }
}
