package day08_stringManipulation_23KASIM;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

         String str= "Java her gecen gun daha da guzellesiyor, degil mi?";

        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); // y

        System.out.println(str.length()); // 50

        // Rastgele bir karakterini yazdiralim

        Random rbd= new Random(); // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur

        int index= rbd.nextInt(str.length()); // str.length()'den kucuk rastgele bir int uretir

        System.out.println(str.charAt(index));



    }
}
