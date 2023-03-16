package day03_dataCasting_MatematikselIşlemler_16KASIM;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candır";

        /* int primitive olduğundan hazır method'ları yoktur
        strimg ise non-primitive olduğu için hazır methodlara sahiptir

        int, char, boolean, gibi primitive data türlerinfe hazır method kullanmak için
        Java Integer, Character, Boolean gibi wrapper class'lar oluşturmuştur

        bunlar pirimitive'ler ile aynı değerleri alabilir
        ama extradan method'ları da vardır
         */

        Integer sayi2=20;

        /* işlemlerimizi yaparken bazen String olarak tanımlanmış
        ancak matematiksel içerik barındıran variable'lar ile karşılaşabiliriz
        Bu durumda bu tür String variable'ları sayıya çevirmek ihtiyacımız olabilir

        Eger sayiya cevirmek istedigimiz metin'lerde
        harf veya sayi olmayan baska karakter varsa
        Java hata verir
         */
        String str2="123";
        String str3="354";
        System.out.println(str2+str3); // 123354

        int str2Int= Integer.parseInt(str2); // 123
        int str3Int= Integer.parseInt(str3); // 354

        System.out.println(str2Int+str3Int); // 477

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        System.out.println(Short.MAX_VALUE); // 32767

        char krk1='$';

        System.out.println(Character.isDigit(krk1)); // false
        System.out.println(Character.isLetter(krk1)); // false
        System.out.println(Character.isAlphabetic(krk1)); // false



    }

}
