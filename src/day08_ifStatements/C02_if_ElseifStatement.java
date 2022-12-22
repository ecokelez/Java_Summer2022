package day08_If_Statements;

import java.util.Scanner;

public class C02_if_ElseifStatement {
    public static void main(String[] args) {

         /*
    Kullanıcıdan 100 üzerinden notunu isteyin.
    Not'u harf sistemine çevirip yazdırın.
    50'den kucukse "D", 50 ye esıt ve ya buyuk - 60 dan kucuk "C",
    60 a esıt 80 den kucuk "B",
    80'nin uzerinde ise "A"
    // gecersız not gırıldıgınde uyarı verelım
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerli  bir not gırınız");
        double note= scan.nextDouble();

        if (note<0 || note>100){
            System.out.println("Lutfen gecerli bir not gırınız");
        } else if (note<50) {           // Bu satıra geldıysek notumuz 0 ile 100 arasındadır
            System.out.println("Notunuz : D ");
        } else if(note<60){           // Bu satıra geldıysek notunuz 50 ile 100 arasında
            System.out.println("Notunuz : C");
        } else if (note<80) {        //   Bu satıra geldıysek not 60-100 arasında
            System.out.println("Notunuz : B ");
        } else {
            System.out.println("Notunuz : A");
        }

        //hocam else if yerine hepsini if olarak yazsaydık
        // ve mesela 50 girseydik d,c,b,a 4 ünü de yazdırırdı demi,
        // else if de ilk doğru bulduğu sout'u yazdırıp orda bırakıyor

    }
}
