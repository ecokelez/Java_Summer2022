package day17_NestedforLoop;

public class C06_NestedforLoop {
    public static void main(String[] args) {




        String ınput="Denız";

        for (int i = 1; i<=ınput.length() ; i++) {

            for (int j = 1; j<=i ; j++) {
                System.out.print(ınput.substring(j-1,j));    // ilk harf icin substring(0,1) olmali
            }
            System.out.println("");
        }



    }
}
