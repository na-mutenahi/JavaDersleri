package day06_IfElseStatement_21KASIM;

import java.util.Scanner;
public class C11_NestedIfElse {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("urunun liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();

        System.out.println("Musteri kartiniz var mi? \nE:Evet  H:Hayir");
        char kartVarmi=scan.next().charAt(0);

        // Urun miktari ana dğişken olsun

        if (urunAdedi>10){ // ururn sayısi 10' dan fazla
          if (kartVarmi=='E' || kartVarmi=='e') System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.8);
          else if (kartVarmi=='H' || kartVarmi=='h') System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
          else System.out.println("Hatalı kart bilgisi");

        } else if (urunAdedi>0) { // urun sayısı 0 -10 arasında
            if (kartVarmi=='E' || kartVarmi=='e') System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
            else if (kartVarmi=='H' || kartVarmi=='h') System.out.println("%10 indirimli toplam fiyat " + urunAdedi*listeFiyati*0.9);
            else System.out.println("Hatalı kart bilgisi");

        }else{ // urun sayısı 0 veya daha az
            System.out.println("Hatali urun adedi");
        }
     }
 }
