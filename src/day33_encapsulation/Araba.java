package day33_encapsulation;

public class Araba {
    String marka="Marka belirtilmedi"; // marka'nin access modifier'i default access modifier
                                        // oldugundan, package icerisinde kullanilabilir

    private String model="Model belirtilmedi";
    private String yakıt="Elektrikli";  // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim

    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // modele  deger atanabılsın ama gorulemesım--> setter
    // Yakıt ise gorulebılsın ama yenı deger atanamasın isteniyor--> getter

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakıt() {
        return yakıt;
    }
}
