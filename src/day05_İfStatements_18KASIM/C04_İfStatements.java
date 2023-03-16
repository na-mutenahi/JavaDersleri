package day05_İfStatements_18KASIM;

import java.util.Scanner;

public class C04_İfStatements {
    public static void main(String[] args) {

        /*
           ÖNEMLİ NOT!!
           if cumlelerinde sart parantezinden sonra body kullanmazsak
           ilk ;'e kadar olan kismi body olarak kabul eder
           yani sadece 1 satir kodu body olarak kabul eder
         */

        /*
        Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        MUtlaka { } kullanilmalidir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        if (girilenSayi%3==0) System.out.println("Uc ile bolunebilen sayi");
        if (girilenSayi%5==0) System.out.println("Bes ile bolunebilen sayi");

    }


}
