package Alıstırmalar;

import java.util.Scanner;

public class IfElseIf_01 {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin.
        // ismi daha uzun ise ----> isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // soyisim daha uzun ise ----> ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scan=new Scanner(System.in);
        ;
        System.out.println("Lutfen isminizi giriniz");
        String Isim=scan.nextLine();

        System.out.println("Lürfen soyisminizi giriniz");
        String soyisim=scan.nextLine();


        String str="zeynep ırmak yılmaz";
        System.out.println(str.replaceFirst("z", "Z"));











    }
}
