package day37_overridding;

public class Outer {
    public static void main(String[] args) {
      // Computer mouse=new Laptop() ;
       // System.out.println(mouse.getValue(100,200));
    }




    class Notebook{
        int getValue(int a,int b){
            if (a>b){
                return a;

            }else {
                return b;
            }


        }
    }


    class Computer extends Notebook{
        int getValue(int a,int b){
            return a*b;
        }

    }

    class Laptop extends Computer{
        int getValue(int a,int b){
            return b-a;
        }
    }
}
