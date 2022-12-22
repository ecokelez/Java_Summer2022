package day12_StringManipulation;

public class C02_replaceAll_T {

    public static void main(String[] args) {

        String str="1Bugun Ja*va- cok g3uz/el";



        str=str.replaceAll(" ","qaw");
        System.out.println(str);

        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str);

        str=str.replaceAll("qaw"," ");
        System.out.println(str);




    }
}
