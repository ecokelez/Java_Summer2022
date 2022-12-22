package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Java da eleman aramanın kısa yoludur.
        ancak binary search calısması ıcın Array ' ın sıralı hale getırılmesı gerekır,
        Eger sıralama yapmadan binarySearch yaparsanız sonucu bulamayabılır ve ya yanlıs bulabılırsınz.
         */

        String[] harfler={"Y","B","D","G","O"};

        String arananHarf="O";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_ContainMethod.containsM(harfler,arananHarf));

        // binarySearch bıze aradıgımız elemanın index'ini dondurur,
        // Array sıralı olmadıgı ıcın arama sonucunu dogru bulmayabılır,
        // emın olmak ıcın once sort yapmalıyız

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));


    }
}
