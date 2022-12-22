package day17_NestedforLoop;

public class C14_WhileLoop {
    public static void main(String[] args) {
        // 20 den 50 ye kadar cıft sayıları yazdıralım

        int bas=20;

        int bıtıs=50;

        for (int i = bas; i <=50 ; i++) {

            if (i%2==0){
                System.out.print(i+" ");
            }

        }


        //  WhileLoop ile yapalım

        System.out.println(" ");  // Bos bır println yazdırdık alt satıra gcmesı ıcın

        int temp=bas;

        while (temp<=bıtıs){
            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }

    }
}
