package day07_If_Statementns;

public class C03_IfStatement {
    public static void main(String[] args) {

     /*
     Bır if statement { kullanılmazsa Java ilk satırı sart ile baglar,
     sonrakı satırlar bagımsız olur,

     Eger bırden fazla satır aynı if sartına baglanmıs ıse mutlaka { kullanmalıyız
      */

        int sayi=4;

        if (sayi>0)
            System.out.println("sayi pozitif");        // ilk satırlar degere  baglı
            System.out.println("pozitif kalacaktır");   // herzaman calsır
            System.out.println("ucuncu satır");        // her zaman calısır


        if (sayi%2==0)
            System.out.println("sayi cift");    // ilk satırlar degere baglı
            System.out.println("cift kalacaktır");  // her zaman calısır

        if (sayi%5==0)
            System.out.println("sayi 5' in tam katı");  // degere baglı


    }
}
