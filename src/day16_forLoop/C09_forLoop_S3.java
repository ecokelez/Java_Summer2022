package day16_forLoop;

public class C09_forLoop_S3 {

    public static void main(String[] args) {

        // 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
        //yazdirin


        int bas=100;
        int son=50;

      /*

        for (int i = bas; i >=son ; i--) {
             System.out.println(i+",");
        }

       */

        for (int i = bas; i >=son ; i--) {

          if (i>son){
              System.out.print(i+",");
            }else System.out.print(i);

        }

    }
}
