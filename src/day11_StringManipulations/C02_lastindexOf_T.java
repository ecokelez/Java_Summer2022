package day11_StringManipulations;

public class C02_lastindexOf_T {

    public static void main(String[] args) {

        String str= "Java ile her sey cok mu cok guzel mı guzel olacak";
        String str1="guzel";

        int strilkIndex=str.indexOf(str1);
        int strSonIndex=str.lastIndexOf(str1);

        if (strilkIndex==-1){
            System.out.println("verılen kelıme cumlede kulanılmamıs");
        } else if (strilkIndex==strSonIndex) {
            System.out.println("verılen kelıme cmlede bır defa kulanılmıs");

        }else{
            System.out.println("verılen kelıme cumlede bırden fazla kulanılmıs");
        }
    }
}
