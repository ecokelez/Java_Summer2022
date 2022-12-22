package day05_MatematıkselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;


        System.out.println("pre-increment: "+ ++sayi);

        System.out.println("post-increment : " + sayi++);

        System.out.println("post-increment'den sonra: "+ sayi);


        // sayi++= sayı artacak ---> once yazdır sonra arttır-- post_

        //++ sayi; artacak ------>   önce arttr sonra yazdır -- pre_

    }
}
