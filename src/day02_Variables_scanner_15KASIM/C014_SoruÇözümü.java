package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C014_SoruÇözümü {
    public static void main(String[] args) {
        /*
        Soru 2* Kullanıcıdan bir double, bir de int sayi alıp
        bunların toplamını,çarpımını ve bölümünü yazdırın,

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ondalık sayi giriniz");
        double sayiDbl= scan.nextDouble();

        System.out.println("Lütfen bir tam sayi giriniz");
        int sayiInt= scan.nextInt();

        System.out.println("sayıların toplamını " + (sayiDbl+sayiInt));
        System.out.println("sayiların çarpımı " + (sayiDbl*sayiInt));
        System.out.println("sayıların bölümü " + ( sayiDbl/sayiInt));
    }

}
