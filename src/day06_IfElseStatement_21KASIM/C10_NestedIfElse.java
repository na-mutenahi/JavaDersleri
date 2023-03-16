package day06_IfElseStatement_21KASIM;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args){

        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi=scan.next().charAt(0);

        System.out.println("Lütfen liste fiyatını giriniz");
        double lisyeFiyati=scan.nextDouble();

        System.out.println("Müşteri kartınız var mı? \nE : Evet H :Hayır");
        char kartVarmi=scan.next().charAt(0);

        // kart ana değişken olsun

        if (kartVarmi=='E' || kartVarmi=='e') { // Kart var
            if (urunAdedi<0) System.out.println("Geçersiz ürün miktarı");
            else if (urunAdedi>10) System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*lisyeFiyati*0.8);
            else System.out.println("%20 indirim toplam fiyat : " + urunAdedi*lisyeFiyati*0.85);


        } else if (kartVarmi=='H' || kartVarmi=='h') { // Kart yok
            if (urunAdedi<0) System.out.println("Geçersiz ürün miktarı");
            else if (urunAdedi>10) System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*lisyeFiyati*0.85);
            else System.out.println("%10 indirimli toplam fiyat : " + urunAdedi*lisyeFiyati*0.9);

        }else System.out.println("Kart bilgisi geçersiz"); // Hatalı kart bilgisi

    }
}
