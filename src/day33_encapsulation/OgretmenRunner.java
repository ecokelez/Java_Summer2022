package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsım("Tulay");
        System.out.println(ogr1.getIsım());

         /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
    }
}
