package day11_StringManipulations;

public class C01_indexOf_T {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf('r'));
        System.out.println(str.indexOf("guzel"));

        System.out.println(str.indexOf("g",6));   // yazılan index' ten baslar ---+
        System.out.println(str.indexOf("g",7));   // + -- bu nedenle 6+1 seklınde yazarız--
        System.out.println(str.indexOf("a",2));   //  bir sonrakı index' ten baslar

         /*
         yukarıdakı str' da 2. ve 3. e'lerın indexlerını bulun
        2.  e'yı bulabılmek ıcın 1. index ıne ıhtıyacım var
         */

        // egrer 2. e varsa 3. e nın olup olmadıgını ve varsa  index ını yazdıralım


        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);
        int ucuncue=str.indexOf("e",ikincie+1);

        if (ikincie==-1){
            System.out.println("verılen str da 2. e yok");
        }else{
            ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verılen str da 3. e yok");
            }else{
                System.out.println("verılen str da 3. e nın index'i :"+ ucuncue);
            }
        }

    }
}
