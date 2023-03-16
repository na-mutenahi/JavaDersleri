package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /*
        Soru 4 - Kullanıcıdamn bir dikdörtgenin 2 kenar uzunluğunu alıp
        dikdörtgenin alanını yazdırın
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin iki kenar uzunluğuna giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin alanı : " + kenar2*kenar1);
    }
}
