package Alıstırmalar;

import java.util.Arrays;

public class Array_SoruCozumu_01 {
    public static void main(String[] args) {

      /*  Soru 33-)
    Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın
    (boşluklar ve özel karakterler dahil).

    Örnek:
    String str=''Kodlama harika.''
    String arr[]: ".etaerg si gnidoC"
    İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
       */
        String str="Kodlama harika";
        String[] spaceSplit=str.split("");

        System.out.println(Arrays.toString(spaceSplit));

        String terstenStr="";

        for (int i = str.length()-1; i >= 0; i--) {

            terstenStr += str.substring(i,i+1);
        }

        System.out.println("Girilen cumlenin tersini yazdırın : " + terstenStr);

    }
}





