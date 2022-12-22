package day07_If_Statementns;

public class C01_AndOperatorleri {

    public static void main(String[] args) {


        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);  // true

        System.out.println(a<0 && b<20 && c>=b); // false
        /*
        Java and operatöru konusunda ıkı seçenek sunar
        && kullanırsak , ilk false bullundugunda artık sonucun false olacagını bılır
        ve gerıye kalan sartları ıncelemez, direkt alt satıra gecer ve daha hızlıdır

        & kullanırsa tum sartları kontrol edersonra sonucu belırler

        bu calısma usulunden dolayı & operatoru , && operatorune gore daha yavas olabılır
         */

        System.out.println(a<0 & b<20 & c>=b );   // false
    }
}
