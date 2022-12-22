package day14_methodCreation;


import day13_MethodCreation.C04_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim

        // Methodlar robot gıbıdır ona bır ıs vermezsenız kös kös oturur :)

          terstenYazdır("Okan");

        C04_methodCreation.topla(7,8);  // Bır oncekı clas' tan cagırdık

    }


      public static void terstenYazdır(String input) {
        String tersInput =  input.substring(3) +
                            input.substring(2, 3);
                            input.substring(1, 2);
                            input.substring(0, 1);


        System.out.println("Verılen kelımenın tersten yazılısı : " + tersInput);

    }
}


