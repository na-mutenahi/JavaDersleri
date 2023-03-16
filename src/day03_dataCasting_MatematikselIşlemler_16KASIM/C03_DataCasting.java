package day03_dataCasting_MatematikselIşlemler_16KASIM;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5); // 5

        System.out.println(29/3); // 9

        //Java bir bölme işleminde 2 int işleme giriyorsa sonucu int olarak verir

        int sayi1= 25;
        int sayi2= 6;

        System.out.println(sayi1/sayi2); // 4

        double dbl=6;// 4.166666666666667

        System.out.println(sayi1/dbl); // 6.25


        // Kullanıcıdan 2 tamsayı alın
        // 1.tamsayı 2.ye bölüp sonucu ondalık olarak yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen birbirine bölmek için iki tam sayi giribniz");

        int ilkSayı= scan.nextInt();
        int ikinciSayı= scan.nextInt();

        System.out.println("İki sayının bölme işlemi sonucu :  "  + ilkSayı/(double)ikinciSayı);



    }
}
