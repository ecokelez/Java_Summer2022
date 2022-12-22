package day21_Arrays;

public class C02_EnUzunKısaKelıme_T {
    public static void main(String[] args) {

        // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun


        String[] ısımler={"Erdal" ,"Mehmet","Onur", "Hayrullah", "Mihrican"};

        enUzunKısaYazdır(ısımler);
    }

    private static void enUzunKısaYazdır(String[] ısımler) {
        String enUzunKelıme=ısımler[0];
        String enKısaKelıme=ısımler[0];

        for (int i = 1; i <ısımler.length ; i++) {

            if (ısımler[i].length()>enUzunKelıme.length()){
                enUzunKelıme=ısımler[i];

            }
            if (ısımler[i].length()<enKısaKelıme.length()){
                enKısaKelıme=ısımler[i];
            }
        }

        System.out.println("Array' dekı en uzun kelıme: "+enUzunKelıme);

        System.out.println("Array' dekı en kısa kelıme: "+enKısaKelıme);
    }
}
