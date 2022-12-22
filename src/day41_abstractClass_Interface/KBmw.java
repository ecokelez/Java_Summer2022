package day41_abstractClass_Interface;

public abstract class KBmw extends DAraba{

    /*
         Araba classında boddy' si olmayan methodlar
     ya kural koy ya da kural uygula anlamına gelir
     */
          /*
      BMW abstract bir class'in
      abstract bir child'i oldugu icin
      Parent class'daki abstract method'lari implement etmek ZORUNDA KALMADI
     */
        public abstract void amblem();
        public abstract void guvenlik();

}
