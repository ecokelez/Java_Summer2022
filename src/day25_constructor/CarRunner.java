package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.yıl=2020;
        car1.marka="Toyota";


        System.out.println("Marka:"+ car1.marka+ "\nModel:"+ car1.model+
                "\nYıl:"+ car1.yıl+ "\nFiyat:"+ car1.fiyat);

        System.out.println(" ");
        Car car2=new Car();   // burada herhangi bir atama yapmadıgımızdan
                            // Objenin olusturuldugu class'da variable'a bir deger atanmis mi bakar
        System.out.println("Car2 bılgılerı\nMarka :"+car2.marka+"\nModel: "+ car2.model
                    +"\nYıl:"+ car2.yıl+"\nFiyat: "+ car2.fiyat);


        /*
            Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
            Java degeri su siralama ile arar
            1- o obje olusturulduktan sonra bir deger atandi mi ? --> hayırsa 2. ye gecer
            2- Objenin olusturuldugu class'da variable'a bir deger atanmis mi bakar--> varsa onları yazdırır;
            3- O da yoksa data turune gore Java default degeri atar

         */
    }
}
