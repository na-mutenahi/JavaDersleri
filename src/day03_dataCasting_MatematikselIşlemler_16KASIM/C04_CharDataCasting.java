package day03_dataCasting_MatematikselIşlemler_16KASIM;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {


        /* char data türü'nün extra bir özelliği vardır
        eğer matematiksel bir işlemde char data türünden bir değer kullanırsanız
        Java o char'ın  ASCİİ değerini gözünde bulundurarak
        matemtiksel işlemi gerçekleştirir
         */

        System.out.println('a'+'b'); // 97+98=195

        System.out.println('a'-32); //97-32=65

        // 'a'-32 'nin char olarak sonucunu yazdırın

        System.out.println((char)('a'-32)); // A




        // kullanıcıdan bir char alıp
        //ascii table'den kullanıcının girdiği chae'ın sonrasındaki
        //3 karakter yazdırın
        // örnek input : a output :b,c,d

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);
        System.out.println((char) (girilenKarakter+1) + ", " +
                          (char) (girilenKarakter+2) + ", " +
                          (char) (girilenKarakter+3));








    }
}
