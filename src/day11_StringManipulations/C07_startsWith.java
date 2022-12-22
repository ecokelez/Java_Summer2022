package day11_StringManipulations;

public class C07_startsWith {

    public static void main(String[] args) {

        String input="Java gun gectıkce guzellesıyor";

        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5));
        System.out.println(input.startsWith("gec",7));


    }
}
