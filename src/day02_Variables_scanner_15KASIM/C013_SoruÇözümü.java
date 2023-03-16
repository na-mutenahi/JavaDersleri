package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C013_SoruÇözümü {
    public static void main(String[] args) {

         /*
        Soru 4 - Kullanıcıdamn bir üçgenin 3 kenar uzunluğunu alıp
        üçgenin alanını yazdırın ve 3 e bölünüz
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        System.out.println("Üçgenin alanı ve 3 e bölümü " + (kenar1+kenar2+kenar3)/ 3);


       }
}
