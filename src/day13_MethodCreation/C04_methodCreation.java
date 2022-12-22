package day13_MethodCreation;

public class C04_methodCreation {
    public static void main(String[] args) {

        // input olarak verilen ıkı int top. sonucunu yazdıran bır method olus.

        int input1=30;
        int input2=20;

       // 1- method call
        //2- Argument eklenmesı gerekıyorsa ekleyelım,
       //  eger methodun return type void den farklı olacaksa, bir varieable olus. assign edelim

       topla(input1,input2);

    }

    public static void topla(int input1, int input2) {

        // 3.adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degistir (access modifier, return Type vb..)
        // 4. eger return type void disinda bir seyse
        //    return keywor'u ve donecek degeri hesaplamaliyiz



        System.out.println("Girilen iki sayinin toplami : "+ (input1+input2));






    }
}