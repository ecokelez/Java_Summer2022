package day37_overridding;

public class EToyota extends DAraba{
    @Override
    void marka(){
         /* super.marka();
          eger hem overridden hem de overridding method'un calismasini istersek
          ilk satira super.marka() yazabiliriz
         */
        System.out.println(" Markamız Toyota");
    }
    void motor(){
        System.out.println("Toyota marka araclar toyota marka motor kullanır");
    }
}
