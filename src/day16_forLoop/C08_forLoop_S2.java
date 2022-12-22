package day16_forLoop;

public class C08_forLoop_S2 {
    public static void main(String[] args) {

    //10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

       int bas=10;
       int son=30;

      //  for (int i = 10; i <=30 ; i++) { ---> son sayıdan sonra da vırgul old. ıcın daha ıf le yapalım
      //      System.out.print( i+",");


        for (int i = bas; i <=son ; i++) {

            if (i<son){
            System.out.print(i+",");

            }else System.out.print(i);


        }






}
}
