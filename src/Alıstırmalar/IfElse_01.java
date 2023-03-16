package Alıstırmalar;

import java.util.Scanner;

public class IfElse_01 {
    public static void main(String[] args) {

        //Soru5- Kullanıcıdan bir harf isteyin,
        //girilen karakter küçük harf ise onu büyük harf olarak yazdırın,
        //yoksa girilen harfi yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);


        if (girilenKarakter >= 'a' && girilenKarakter <= 'z') {
            // küçük harf ise büyük harf olarak yazdıralım
            System.out.println((char) (girilenKarakter - 32));
            System.out.println(Character.toUpperCase(girilenKarakter));

        } else {
            // küçük harf değilse girilen harfi yazdıralım
            System.out.println(girilenKarakter);
        }


    }
}

