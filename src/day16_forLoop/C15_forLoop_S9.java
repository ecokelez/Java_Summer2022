package day16_forLoop;

import java.util.Scanner;

public class C15_forLoop_S9 {
    public static void main(String[] args) {

        //Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        //palindrome olup olmadigini kontrol eden bir program yazin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır string gırınız");
        String str = scan.nextLine();


        Palindrom(str);

    }

    private static void Palindrom(String str) {
        for (int i = 0; i <= str.length(); i++) {
            if ((str.charAt(0) == str.charAt(str.length() - 1)) && (str.charAt(1) == str.charAt(str.length() - 2))) {
                System.out.println(str);
            } else if (str.charAt(0)==str.charAt(str.length()-1)) {
                System.out.println(str);
            }else System.out.println("Gırdıgınız ıfade Palindrom degıldır");
        }
    }
}
