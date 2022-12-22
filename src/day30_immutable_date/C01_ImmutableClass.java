package day30_immutable_date;



import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {


    public static void main(String[] args) {

        List<String> List=new ArrayList<>();

        List.add("Kenan");
        List.add("Enes");
        List.add("Ismail");

        System.out.println(List);  //  [Kenan, Enes, Ismail]

        List.set(1,"Yasemin");
        System.out.println(List);  // [Kenan, Yasemin, Ismail]

        List.remove("Ismail");
        System.out.println(List);  //  [Kenan, Yasemin]



    }
}
