package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str="123a5";


        int sayı= 0;

        try {
            sayı = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdıgınız deger sadece rakamlardan olusmalıdır");;
        }catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu");;
        }


        System.out.println("Sayının karesi :" + (sayı*sayı));

        /*
        Kullanicidan Sting olarak bir deger aliyor ve bunu int ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongorururz
        bunun NumberFormatException aldigimizda kodun durmamamsini istiyorsak try catch ile cevirebiliriz
        Eger bilmedigimiz bir exception daha olusursa kodum durmasin istiyorsak bir kere daha catch cumlesi ekleyip
        onada En genis Exception i yazabiliriz.
        //   String str2=3; // Exception degildir, CTE (Compile Time Error) yazım hatasıdır
        */
    }
}
