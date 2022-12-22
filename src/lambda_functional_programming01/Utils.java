package lambda_functional_programming01;

public class Utils {
    public static void aynıSatırdaBosluklaYazdır(Object obj){
        System.out.print(obj+" ");
    }
    public static boolean ciftElemanlarıSec(int x){
        return x%2==0;
    }
    public static boolean tekElemanlarıSec(int x){
        return x%2!=0;
    }
    public static int karesiniAl(int x){
        return x*x;
    }
    public static int kupunuAl(int x){
        return x*x*x;
    }
    public static double yarısınıAl(double x){
        return x/2.0;
    }
    public static char sonKarakteriAl(String str){
        return str.charAt(str.length()-1);
    }
    public static char ilkKarakteriAl(String str){
        return str.charAt(0);
    }
    public static int rakamlarToplamınıAl(int x){
        int toplam=0;

      while(x>0){
          toplam+=x%10;
          x/=10;
      }
      return toplam;
    }
}
