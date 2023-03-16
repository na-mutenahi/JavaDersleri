package day06_IfElseStatement_21KASIM;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {

  // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen ürün adedini giriniz");
        int urunAdedi=scan.nextInt();

        System.out.println("Lütfen ürün lisre fiyatını giriniz");
        double listeFiyati=scan.nextDouble();

        System.out.println("Musteri kartınız var mi? \nE: Evet H:Hayir");
        char kartinizVarmi=scan.next().charAt(0);

        if (kartinizVarmi=='E' && urunAdedi>10){
            System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.8);
        } else if (kartinizVarmi=='E' && urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat " + urunAdedi*listeFiyati*0.85);
        } else if (kartinizVarmi=='H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat " + urunAdedi*listeFiyati*0.85);
        } else if (kartinizVarmi=='H' && urunAdedi>0){
            System.out.println("%10 indirimli toplam fiyat " + urunAdedi*listeFiyati*0.9);
        } else {
            System.out.println("Hatali bilgi");

        }
    }
}