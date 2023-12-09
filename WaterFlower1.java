public class WaterFlower1 {
    public static void main(
            String[] args) {
        //计算1000以内的水仙花数
        int sum = 0;
        System.out.println("下面为水仙花数");
        for (int i = 100; i < 1000; i++) {
//            简单方案(方案1)
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100;
//            sum = (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai);
//            if (sum == i) {
//                System.out.println(sum);
//            }
//          (方案2 不一定准确仅供参考)

            int jil = i;
            while(jil != 0){
                int ge = jil %10;
                jil = jil / 10;
                sum = (ge * ge * ge) + sum;
            }

            if(sum == i){
                System.out.println(i);
                sum = 0;
            }else {
                sum = 0;
            }






            }
        }
    }

