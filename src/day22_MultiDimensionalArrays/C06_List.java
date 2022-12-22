package day22_MultiDimensionalArrays;


import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {


         /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */


        List<String> ısımler=new ArrayList<>();
        System.out.println(ısımler);  // []


        // bir list'e eleman eklemek istersek
        ısımler.add("Basak");

        System.out.println(ısımler.add("Ayse"));  // true doner

        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman

         */


        System.out.println(ısımler);  // [Basak, Ayse]


         /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir

         */
    }
}
