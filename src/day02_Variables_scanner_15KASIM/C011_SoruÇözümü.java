package day02_Variables_scanner_15KASIM;

import java.util.Scanner;
public class C011_SoruÇözümü {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Karesini almak istediğiniz sayiyi yazınız");
        double girilenSayi= scan.nextDouble();
        System.out.println("Girilen sayının karesi " + girilenSayi*girilenSayi);



    }
}
