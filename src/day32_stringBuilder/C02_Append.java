package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsın");

        sb.append("?");  // append --> istedımız String i en sona ekler
        System.out.println(sb);


        sb.append("Java",2,4);
        System.out.println(sb);

        sb.insert(4," herseyi dusunmus,"); // aralara ekleme yapmak ıstedıgımızde insert kullanılır
        System.out.println(sb);


        sb.insert(22,"valla valla",0,5);
        System.out.println(sb);

    }
}
