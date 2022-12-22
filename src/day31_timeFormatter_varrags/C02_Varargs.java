package day31_timeFormatter_varrags;

public class C02_Varargs {
    public static void main(String[] args) {

        // degısken sayıdakı argument==varargs

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;
        int sayı4=40;


        toplaYazdır(sayı1, sayı2,sayı3,sayı4);

    }

    private static void toplaYazdır(int sayı1, int sayı2, int sayı3, int sayı4) {
        System.out.println();
    }

    private static void toplaYazdır(int sayı1, int sayı2, int sayı3) {
        System.out.println();
    }

    private static void toplaYazdır(int sayı1, int sayı2) {
        System.out.println();
    }
}
