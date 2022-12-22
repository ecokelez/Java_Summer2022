package day09_Ternary;

public class C06_Switch_Case {
    public static void main(String[] args) {

        /*
        Kull. gun ısmı alın hafta ıcı ve a hafta sonu old yazdırın
         */


        String input="Cuma";
        input=input.toLowerCase();

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta ıcı");
                break;
            case "salı":
                System.out.println("Hafta ıcı");
                break;
            case "carsamba":
                System.out.println("Hafta ıcı");
                break;
            case "persembe":
                System.out.println("Hafta ıcı");
                break;
            case "cuma":
                System.out.println("Hafta ıcı");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerlı bır gun gırınız");


        }
    }
}
