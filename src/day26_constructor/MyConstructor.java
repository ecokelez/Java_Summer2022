package day26_constructor;

public class MyConstructor {

    int x=5;

     MyConstructor(){                       //   5               //  11
         System.out.println("-x" + x);      // 6 --->  -x5      // 12  --->   -x5
                                            // -- 4 atanmammıs    o sebeple 5 yazdık
     }                                      // 7                  // 13

     MyConstructor(int x){                         //    3
            this();  //  Constructor call           //   4

         System.out.println("-x"+ x);               //  8  ---->  -x4  Scope icerıısnde

     }                                                // 9


    public static void main(String[] args) {         // 1

         MyConstructor mc10=new MyConstructor(4);    // 2

         MyConstructor mc2=new MyConstructor();           // 10

    }                                                       //  14

}


