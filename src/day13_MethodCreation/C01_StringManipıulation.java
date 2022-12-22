package day13_MethodCreation;

public class C01_StringManipıulation {
    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        double sayı1=Double.parseDouble(str1);
        str2=str2.replaceAll("\\D","");
        double sayı2=Double.parseDouble(str2);

        System.out.println("$"+(sayı1+sayı2)/100);





    }

}
