package day24_ArrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtakElemanlarıBul {
    public static void main(String[] args) {

        // Soru 3:
        //iki String array olusturunuz ve
        // bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz


        String[] arr1={"Ali","Veli","Can","Ayse"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        List<String> ortakIsımler=new ArrayList<>();

        for (String each1:arr1) {

            for (String each2:arr2) {

                if (each1.equalsIgnoreCase(each2)){
                    ortakIsımler.add(each1);
                }

            }

        }

        if (ortakIsımler.isEmpty()){
            System.out.println("Hic ortak eleman yok");
        }else {
            System.out.println("her ıkı arraydeki ortak ısımler:" + ortakIsımler);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
