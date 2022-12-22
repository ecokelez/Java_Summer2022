package day11_StringManipulations;

public class C05_endsWith {
    public static void main(String[] args) {
        String str="Ah be Java olsun";

        System.out.println(str.endsWith("ava"));  // true

        System.out.println(str.endsWith("be Java"));

        System.out.println(str.endsWith("Ah be Java"));

        System.out.println(str.endsWith(""));   // true


    }
}
