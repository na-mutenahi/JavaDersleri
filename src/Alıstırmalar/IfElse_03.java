package Alıstırmalar;

import java.util.Scanner;

public class IfElse_03 {
    public static void main(String[] args) {

        /*
        //Kullanıcıdan bir harf isteyin.
        //Kullanıcı birden fazla harf girerse ---> ilk harfin alınmasını sağlayın. (Ö,İ,Ü işleme alınmasın)
        //Ayrıca girilen harfte büyük küçük olmasını göz ardı edin.
        //Harf sesli harf ise ---->  "harf sesli bir harftir" değilse girilen harf sesli harf değildir yazdırın.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);

        if (girilenHarf== (char) 'Ö' && girilenHarf==(char) 'İ' && girilenHarf== 'Ü') {
            System.out.println("Geçersiz islem");
        }else if ((girilenHarf>=(char) 'a' && girilenHarf<=(char) 'z')
                || (girilenHarf>=(char) 'A' && girilenHarf<=(char) 'Z')){

            if (girilenHarf==(char) 'A' && girilenHarf==(char) 'a'){
                System.out.println("Sesli harftir");}
            else if (girilenHarf== (char)'E' && girilenHarf==(char)'e') {
                System.out.println("Sesli harftir");}
            else if (girilenHarf==(char)'i') {
                System.out.println("Sesli harftir");}
            else if (girilenHarf== (char)'O' && girilenHarf==(char)'o') {
                System.out.println("Sesli harftir");}
            else if (girilenHarf== (char)'ö') {
                System.out.println("Sesli harftir");}
            else if (girilenHarf== (char)'A' && girilenHarf==(char)'a'){
                System.out.println("Sesli harftir");}
            else if (girilenHarf== (char)'ü'){
             System.out.println("Sesli harf");}

        }   else System.out.println("Sessiz harf");
    }
}
