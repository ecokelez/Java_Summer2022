package day36_inheritanceDataTypeKullanımı;

public class CMemur extends BMuhasebe{

    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar :" + (30*saatUcreti*gunlukMesai) + " maas alır");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptırabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12

        mmr1.maas();  // Memurlar :3240 maas alır
        mmr1.ozelSigorta();  // Memurlar %60 indirimli ozel sigorta yaptırabilir

        System.out.println(mmr1.isim);  // Personel
        System.out.println(mmr1.soyisim);  //Personel
        System.out.println(mmr1.departman);  //Personel


        BMuhasebe mhsb1=new BMuhasebe();
            // Data tur ve Cost. tru aynı ise dogrudan muhasebeye gdilir
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */
        System.out.println(mhsb1.gunlukMesai); // 8
        System.out.println(mhsb1.saatUcreti);   // 10

        mhsb1.maas();  // Muhasebe-Personel minumum : 2400 maas alir
        mhsb1.ozelSigorta();  // Muhasebe-Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();   // P--Tum personelimiz sigorta yapilir

        System.out.println(mhsb1.isim);  // Personel
        System.out.println(mhsb1.soyisim);  //Personel
        System.out.println(mhsb1.departman);  //Personel



    }


}
