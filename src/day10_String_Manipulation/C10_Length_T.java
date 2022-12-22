package day10_String_Manipulation;

public class C10_Length_T {
    public static void main(String[] args) {

        String str="Javayı sevmeye basladım";
        System.out.println(str.length());   //  Verilen String' dekı karakter sayısını verir,dondurur.

        System.out.println(str.length()-1);
        System.out.println(str.length()-4);
        System.out.println(str.charAt(str.length()-5));
        System.out.println(str.toUpperCase().charAt(str.length()-8));
        System.out.println(str.toLowerCase().charAt(str.length()-23));


        String str1="";
        System.out.println(str1.length());

        String str2=null;
        System.out.println(str2.length());



    }
}
