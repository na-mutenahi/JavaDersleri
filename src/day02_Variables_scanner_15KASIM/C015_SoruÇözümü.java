package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C015_SoruÇözümü {
    public static void main(String[] args) {

        /*
        Soru 7 - (Interview) - Kullanıcıdan iki sayi alıp
        ikisinin değerlerini değiştirin(swap).

        Kullanıcının girdiği değerler
        sayı1= 10 sayi=20 ise

        siz kod ile bunların değerlerinş değiştirip
        sayi1=20  sayi2=10 yapın

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayi1 değerini giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen sayi2 değerini giriniz");
        int sayi2=scan.nextByte();

        int temp;

        // 1. adım sayi2 değerini temp'e atayalım

        temp=sayi2;

        // 2. adım sayı1 değerini sayı2'ye atayalım

        sayi2=sayi1;

        // 3. adım temp'deki,değeri sayı1'e atayalım

        sayi1=temp;

        System.out.println("sayıların değerlerini değiştirin " +
                "\n sayi1'in yeni değeri " + sayi1 +
                "\n sayi2'nin yeni değeri " + sayi2 );









    }
}
