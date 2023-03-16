package Alıstırmalar;

public class ForLoop_SoruCozumu_03 {
    public static void main(String[] args) {

        /* Soru29-)1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
            sonra tum sayiların toplamını tersine cevirin
            İpucu: Loop kulanabilirsiniz

         */

        int sayilarınToplami=0;

        for (int i = 1; i <=100 ; i++) {

            sayilarınToplami+=i;

        }
        System.out.println("");
        System.out.println("tum sayiların toplmai=" + sayilarınToplami);
        String sayilarınToplamiS="5050";
        String sayilarınTersi="";

        for (int i = sayilarınToplamiS.length()-1; i>=0 ; i--) {

            sayilarınTersi=sayilarınTersi + sayilarınToplamiS.substring(i,i+1);
        }
        System.out.println("sayıların tersi=" + sayilarınTersi);

    }

}
