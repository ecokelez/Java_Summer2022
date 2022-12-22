package day17_NestedforLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        /*
         verilen Stringdeki kullanilan harfleri
        tekrarsiz olarak yazdirip
        kelimede kullanilan farkli harf sayisini veren bir method yaziniz

         */


        String input="aaabbbbcccddddaa";

        tekrarsızYap(input);
    }

        private static void tekrarsızYap(String input) {
            String benzersizInput="";

        String islenecekKelıme=input.replaceAll("\\ W","");
        System.out.print(islenecekKelıme.substring(0,1));
        benzersizInput+=islenecekKelıme.substring(0,1);

        for (int i = 1; i < islenecekKelıme.length(); i++) {

            if (!benzersizInput.contains(islenecekKelıme.substring(i,i+1))){

                System.out.print(","+islenecekKelıme.substring(i,i+1));

                benzersizInput+=islenecekKelıme.substring(i,i+1);
            }
        }

        System.out.println("");
        System.out.println("input: "+ input);
        System.out.println("benzersız ınput : " + benzersizInput);




    }
}
