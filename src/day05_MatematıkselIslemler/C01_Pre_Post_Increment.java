package day05_MatematıkselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1=10;

        int sayi2=  sayi1+1; // sayi2 -->11

        sayi2 +=5; // sayi2-->16


        /*
        pre ve ya post ıncrement sadece ++ ve -- islem ıcın gecerlıdır
        bu islem icin sayıdan once va ya sonra yazmasına gore farklı iki islem olur
         */

        int sayi3= sayi2++;  //  1- sayi2 degeri , sayi3' e atanacak
                             //  2- sayi2 bir arttırılacak

        /*
        ++ ve ya --  variable' d an sonra olursa una post.... ,
        bu durumda  o satırda yapılan iki islemden artırma ve ya azaltma islemi sonucudur
         */

        System.out.println("sayi3 : "+ sayi3);    // 16
        System.out.println("sayi2: "+ sayi2);    //  17



        int sayi4=++sayi1;    // 1- sayi1 bir arttırılacak
                             // 2- sayi1 degeri sayi4'e atanacak
        /*
        eger ++ ve ya -- variable' dan önce ise buna pre.... denir,
        bu durmda o satırda yapılan iki islemden onceliklı olan arttırma ve ya azaltmadır
         */

        System.out.println("sayi4 : "+ sayi4); // 11
        System.out.println("sayi1 : "+ sayi1 ); // 11



    }
}
