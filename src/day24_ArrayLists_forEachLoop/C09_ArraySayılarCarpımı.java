package day24_ArrayLists_forEachLoop;

public class C09_ArraySayılarCarpımı {

    public static void main(String[] args) {

        int[] sayilar= {2,3,4,1,5,7,6,5,4,3};

        int carpım=1;

        for (int each:sayilar
             ) {
            carpım*=each;
        }

        System.out.println("Arraydekı sayıların carpımı:"+ carpım);
    }
}
