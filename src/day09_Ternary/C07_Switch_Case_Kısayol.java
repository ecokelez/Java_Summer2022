package day09_Ternary;

public class C07_Switch_Case_Kısayol {

    public static void main(String[] args) {


        /*
        Kull. gun ısmı alın hafta ıcı ve a hafta sonu old yazdırın
         */

        String input="Cuma";
        input=input.toLowerCase();

        switch (input){
            case "pazartesi":

            case "salı" :

            case "carsamba" :

            case "persembe" :

            case"cuma" :
                System.out.println("Hafta ici");
                break;

            case "cumartesi" :

            case"pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerlı bır gun gırınız");

        }




    }
}
