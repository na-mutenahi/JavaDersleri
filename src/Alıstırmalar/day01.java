package Alıstırmalar;

public class day01 {
    public static void main(String[] args) {

        int h=43;

        System.out.println("h'nin değeri : " +  ++ h);

        int y= h++;

        System.out.println("y'nin değeri :" + y);

        int z= y++ + h;

        System.out.println("z'nin değeri : " + z);
        System.out.println("Son toplam : " +(h+y+z));


        int a1=25;

        System.out.println("a1'in değeri : " + ++a1);

        int a2=a1++;

        System.out.println("a2'nin değei : " + a2 );

        int a3=a2++ +a1;

        System.out.println("a3'ün değeri : " + a3);
        System.out.println("Son toplam : " + (a1+a2+a3));

        //Kullanicidan bir String ve aranacak metin alin.
        // String’in aranan metni
        //icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.

        String input="Kendine guven, java ogren";
        String aranacakMetin="ogren";

        System.out.println(input.lastIndexOf(aranacakMetin));

        // Kullanicidan bir String ve aranacak metin alin.
        // Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
        // String aranan metni icermiyor
        // Aranan metin String’de sadece 1 kere kullanilmis
        // Aranan metin String’de sadece 1’den fazla kullanilmis

        String input2="Hayat sevinve guzel ama sevince guzel";
        String aranacakMetin2="guzel";




    }

}
