package day17_NestedforLoop;

public class C10 {
    public static void main(String[] args) {


                boolean dogruMu=false;
                int sayı=10;

                while (!dogruMu){

                    if (sayı>20){   // sart saglandıgında while loop un condıtıon' ı false olmalı
                        System.out.println("Bu ıslem tamam");
                        dogruMu=true;
                    }else {    // sart saglanmadıgı muddetce while loopun kontrol ettıgı  degısken degısmelı
                        System.out.println("Istenen sart saglanmadı"+ sayı);
                        sayı++;
                    }

                }


    }
}
