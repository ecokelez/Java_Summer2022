package day33_encapsulation;

public class Ogretmen {

    private String ısım;
    private String soyısım;
    private String brans;

       /*
      Bazen de yetkileri sinirlamak degil de
      yapilan isi daha iyi tanimlamak icin
      encapsulation kullanilir
      Bu yaklasimi kullanan class'larda
      tum variable'lar private yapilip
      hepsi icin getter ve setter olusturulur
     */

    public String getIsım() {
        return ısım;
    }

    public void setIsım(String ısım) {
        this.ısım = ısım;
    }

    public String getSoyısım() {
        return soyısım;
    }

    public void setSoyısım(String soyısım) {
        this.soyısım = soyısım;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
