package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin
        // ve sayının karesini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediğiniz sayıyı giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("Girilen sayinin karesi : "+girilenSayi*girilenSayi);
    }
}
