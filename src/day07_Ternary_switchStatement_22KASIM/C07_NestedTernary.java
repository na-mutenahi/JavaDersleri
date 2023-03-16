package day07_Ternary_switchStatement_22KASIM;

public class C07_NestedTernary {
    public static void main(String[] args) {
        /* Kullanicidan bir tamsayi alin
        --> sayi pozitifse ----> "çift sayi" yada "çift sayi" değil seçeneklerinden uygun olanı yazdırın
        --> sayi pozitif değilse ----> "3 basamaklı" veya "3 basamaklı değil" seçeneklerinden uygun olanı yazdırın
         */

        int sayi=23;

        // System.out.println(sayi>0 ? "Sayi pozitif " : "Sayi pozitif değil");

        System.out.println(sayi>0
                            ?
                            sayi%2==0 ? "çift sayi" : "tek sayi "
                            :
                            -100>=sayi && sayi>=-999 ? "3 basamaklı" : "3 basamaklı değil"
                            );

     //ÖNEMLİ NOT!! Ternary de hiç bir zaman böyle bir kod yazılmaz!!
   //System.out.println(sayi>0 ? sayi%2==0 ? "cift sayi" : "tek sayi" :-100>=sayi && sayi>=-999 ? "3 basamakli" : "# basamakli degil");

    }
}
