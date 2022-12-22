package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        //Bu method String dondurdugu ıcın StrignBuilder' ın eski halini degistıremez
        System.out.println(sb);

        sb.subSequence(0,3);
        System.out.println(sb);

        sb.subSequence(1,2);
        System.out.println(sb);



    }
}
