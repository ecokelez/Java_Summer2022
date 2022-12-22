package day32_stringBuilder;

public class C08_Mix {
    public static void main(String[] args) {
          String numbers="012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));


        int total=0;
        StringBuilder letters=new StringBuilder("abcdefg");
        total+=letters.substring(1,2).length();
        total+=letters.substring(6,6).length();
       //  total+=letters.substring(6,5).length();
        System.out.println(total);
    }
}
