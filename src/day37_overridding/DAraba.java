package day37_overridding;

public class DAraba {

    private void yakıt(){
        System.out.println("Tum arabalar yakıt kullanır");
         /*
         Parent class'dan override edilmesini istemediginiz method'lari
         private, static veya final yapabilirsiniz
         */
    }

    void marka(){
        System.out.println("Tum arabaların markası vardır");
    }
    void motor(){
        System.out.println("Tum arabaların motoru vardır");
    }
}
