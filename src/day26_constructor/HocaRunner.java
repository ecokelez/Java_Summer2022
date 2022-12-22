package day26_constructor;

public class HocaRunner {
    public static void main(String[] args) {
       Hoca hoca1=new Hoca() ;
        System.out.println("Hoca1:"+hoca1);

        Hoca hoca2=new Hoca("Zeynep","Elif","1/1/1994","Matematik","Fizik");
        System.out.println("Hoca2 "+hoca2);

        Hoca hoca3=new Hoca("Reyhane","Dal","1/1/1992");
        System.out.println("Hoca3 "+hoca3);
    }
}
