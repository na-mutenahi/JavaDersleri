package day17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str="Java her gecen gun guzellesiyor";

        // str'da kac kelime var ?
        // split method'u istedigimiz String'i, istedigimiz ayirac kullanarak
        // parcalara ayirmamiza imkan verir

        String [] spaceSplit= str.split(" ");

        System.out.println(Arrays.toString(spaceSplit));
        System.out.println("Verilen cumledeki kelime sayisi : " + spaceSplit.length);

        System.out.println(Arrays.toString(str.split("e")));

        System.out.println(Arrays.toString(str.split("gun")));

        System.out.println(Arrays.toString(str.split("")));

    }
}
