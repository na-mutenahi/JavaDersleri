package day07_Ternary_switchStatement_22KASIM;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        /* kullanicidan bir tamsayi alin

          --> sayı negatif ise ---->  " negatif sayi
          --> sayi rakam ise ---->  "girilen sayi rakam"
          --> sayi 2 basamakli ise ---->  "girilen sayi 2 basamakli"
          --> sayi 2 basamaktan buyukse ---->  "buyuk sayi" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi<0) System.out.println("Negatif sayi");
        else if (girilenSayi<=9) System.out.println("Girilen sayi rakam");
        else if (girilenSayi<=99) System.out.println("Girilen sayı 2 basamakli");
        else System.out.println("Büyük sayi");




    }
}
