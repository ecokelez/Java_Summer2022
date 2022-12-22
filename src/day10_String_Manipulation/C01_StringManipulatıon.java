package day10_String_Manipulation;

public class C01_StringManipulatıon {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0));   // ilk harfı yazdırır

        System.out.println(str.toUpperCase().charAt(7));   // R

        System.out.println(str.charAt(21));  //   "l"

        /*
               Bu metod ıstedıgımız ındex' tekı karakterı bıze dondururv ve 0 dan baslar

            -- son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
          -- eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek Java exception verir
         --charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz

          --System.out.println(str.charAt(22)) -->   StringIndexOutOfBoundsException

        -String method'larindan kullanmamiz gereken bir method varsa---- +
           +---- charAt( ) 'den once kullanmaliyiz

         */



    }
}
