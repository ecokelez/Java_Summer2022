package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch_T {
    public static void main(String[] args) {

        String[] harfler={"Y","B","D","G","O"};

        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_ContainMethod.containsM(harfler,arananHarf));


        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

    }
}
