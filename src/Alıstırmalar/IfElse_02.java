package Alıstırmalar;

import java.util.Scanner;

public class IfElse_02 {
    public static void main(String[] args) {

        /*
           Üç sayı kabul eden ve en büyük sayıyı bulan Java programını yazınız.
        ornek:
       Giriş:
        İlk sayı: 4
        İkinci sayi: 8
        Üçüncü sayı: 1

       Çıktı:
        En büyük sayı: 8
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("Üc tamsayi yazınız");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();

        if (sayi1<sayi2 && sayi2>sayi3){
            System.out.println("En buyuk sayi : " + sayi2);

        } else if (sayi3<sayi1 && sayi1>sayi2){
            System.out.println("En buyuk sayi : " + sayi1);

        } else if (sayi3>sayi2 && sayi3>sayi1) {
            System.out.println("En buyuk sayi : " + sayi3);

        }else System.out.println("yanliş sayı giriş yaptınız");

    }
}
