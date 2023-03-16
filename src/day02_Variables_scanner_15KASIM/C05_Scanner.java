package day02_Variables_scanner_15KASIM;

import  java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Kullanıcıdan ismini alın
        // ve girilen ismi buyuk harflerle yazdırın

        // Kullanıcıdan değer almak için 3 işlem yapmanız gerekir
        // 1. adım scanner objesi oluşturmak

        Scanner scan = new Scanner(System.in);

        // 2. adım kullanıcıya ne istediğinizi söyleyin

        System.out.println("isminizi yazın");

        // 3.adım kullanıcının gireceği değeri kaydedeceğiniz bir variable oluşturun
        // scan objesi ile ilgili method'u kullanarak kullanıcının girdiği değeri
        // oluşturduğunuz variable'a atayın

        String girilenIsim= scan.nextLine();

        // Artık kullanıcının girdiği değer girilen isim variable'ında kayıtlı

        System.out.println(girilenIsim.toUpperCase());




      // Ders Tekrarı

        Scanner scen= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println(isim.toUpperCase());

        Scanner scenn= new Scanner(System.in);
        System.out.println("okul adınızı yazın");
        String okulAdı=scan.nextLine();
        System.out.println(okulAdı.toLowerCase());









    }
}
