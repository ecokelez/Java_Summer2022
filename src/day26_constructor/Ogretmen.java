package day26_constructor;

public class Ogretmen {

    String ısım="Isım belirtilmedi";
    String soyısım="Soyısım belirtilmedi";
    String dogumTarıhı="Tarıh belirtilmedi";
    String brans="Brans belirtilmedı";
    String yanBrans="Yan brans belirtilmedi";


    public Ogretmen() {

    }

    public Ogretmen(String ısım, String soyısım, String dogumTarıhı, String brans, String yanBrans) {
        this.ısım = ısım;
        this.soyısım = soyısım;
        this.dogumTarıhı = dogumTarıhı;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String ısım, String soyısım, String dogumTarıhı) {
        this.ısım = ısım;
        this.soyısım = soyısım;
        this.dogumTarıhı = dogumTarıhı;
    }

    @Override
    public String toString() {
        return
                "\nısım:" + ısım +
                "\nsoyısım='" + soyısım +
                "\ndogumTarıhı:" + dogumTarıhı +
                "\nbrans:" + brans +
                "\nyanBrans:" + yanBrans ;
    }
}
