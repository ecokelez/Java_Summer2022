package day15_overlooding_forLoop;

public class C06_StringTersCevirme {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun


        String input="Java gun gectıkce guzellesıyor";

            tersYazdır(input);


    }

    public static void tersYazdır(String input) {
        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println( tersInput);




        }
    }

