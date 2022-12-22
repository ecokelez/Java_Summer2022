package day26_constructor;

public class Rope {

    public static  void swing(){
        System.out.println("swing");
    }

    public static void   climb(){ // sonradan static ekledık ve yaptık
        System.out.println("climb");
    }

    public static  void play(){
        swing();
        climb();
    }

    public static void main(String[] args) {
        Rope rope=new Rope();
        rope.play();
        Rope rope2=null;
        rope2.play();
    }
}
