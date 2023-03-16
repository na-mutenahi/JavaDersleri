package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C010_Scanner {
    public static void main(String[] args) {
        /*
        Soru 2* Kullanıcıdan bir double, bir de int sayi alıp
        bunların toplamını ve çarpımını yazdırın,

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalık sayı girin");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lutfen bir tam sayı girin");
        int sayiInt= scan.nextInt();


        System.out.println("Sayıların toplamı :" + ( sayiDbl+sayiInt));
        System.out.println("Sayıların çarpımı :" + sayiDbl*sayiInt);
    }
}
