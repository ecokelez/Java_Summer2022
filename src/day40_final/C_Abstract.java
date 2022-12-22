package day40_final;

public  abstract class C_Abstract {

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();

    void cıkarma(){
        System.out.println("Bu method cıkarma yapar");
             /*
     bir method'un basina abstract yazarsaniz
     bu method'un child class'lar icin bir standart oldugunu declare ederiz
     ve method body'sine ihtiyac kalmaz
     */
    }

}
