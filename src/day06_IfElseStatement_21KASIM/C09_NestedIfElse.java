package day06_IfElseStatement_21KASIM;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         /*
           eger degisken sayimiz birden fazla ise
           degiskenlerden birini oncelige alarak,
           ona gore bir if else yapisi kurulur
           ornegin bu soruda kadin/erken secimini ana degisken yapalim

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsyetinizi giriniz  \nK : Kadın, E : Erkek" );
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if (cinsiyet=='K' || cinsiyet=='k'){ // Kadınlar için bu bölüm çalışacak
            if (yas<18 || yas>80) System.out.println("Geçersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak için " + (60-yas) + "yıl daha çalışmalısın");

        } else if (cinsiyet=='E' || cinsiyet=='e') { // Erkekler için bu bölüm çalışacak
            if (yas<18  || yas>80) System.out.println("Geçersiz yaş");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak için " + (65-yas) + "yıl daha çalışmalısın");

        }else {
            System.out.println("cinsiyet bilgisi hatalı");
        }
 }
 }