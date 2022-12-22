package day20_Arrays;

public class C07_Arrays_S2 {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun


        String[] ısımler={"Ersoy" ,"Mehmet","Elif", "Muhammet", "Mihrican"};

        enUzunveEnKısYaz(ısımler);

    }

    private static void enUzunveEnKısYaz(String[] ısımler) {


        String enKısa=ısımler[0];
        String enUzun=ısımler[0];

        for (int i = 0; i <ısımler.length ; i++) {

            if (ısımler[i].length()>enUzun.length()){
                enUzun=ısımler[i];
            }
            if (ısımler[i].length()<enKısa.length()){
                enKısa=ısımler[i];
            }
        }
        System.out.println("Array' dekı en uzun kelıme:" + enUzun);
        System.out.println("Array' dekı en kısa kelıme:" + enKısa);
    }


}
