package day34_inheritance;

public class Toyota {

    protected String marka="Toyota";
    private String model="Model belirtilmedi";
    protected String yakıt="Yakıt belirtilmedi";

    public void motor(){
        System.out.println("Toyota cevrecı motorlar kullanır");

    }

    public  void  aku(){

        System.out.println("Toyota modele gore aku kullanır");
    }

}
