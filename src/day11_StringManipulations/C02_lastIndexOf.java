package day11_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay,Java cok guzel";
        String kelıme="Java";

        /*
        verilen kelıme ıcın asa. uygun olanı yazınız
        - verılen kelıme cmlede kulanılmmamaıs
        - verılen kelıme cumlede  sadece 1 kere kullanılmıs
        -verılen kelıme cumlede  bırden fazla kullanılmıs

         */
        int kelımeIlkIndex=cumle.indexOf(kelıme);
        int kelımeSonIndex=cumle.lastIndexOf(kelıme);

        if (kelımeIlkIndex==-1){
            System.out.println("verılen kelıme cmlede kulanılmmamaıstır");
        } else if (kelımeIlkIndex==kelımeSonIndex) {
            System.out.println("verılen kelıme cumlede  sadece 1 kere kullanılmıstır");
        }else{
            System.out.println("verılen kelıme cumlede  bırden fazla kullanılmıstır");

        }

    }
}
