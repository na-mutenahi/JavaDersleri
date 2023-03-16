package Alıstırmalar;

import java.util.Scanner;

public class zor {
  public static void main(String[] args) {

      // Kullanicidan bir String alin
    Scanner scan= new Scanner(System.in);
    System.out.println("Lutfen bir cumle giriniz");
    String girilenCumle=scan.nextLine();

    // String'in uzunlugu cift sayi ise tam ortasina :) ekleyin

       if (girilenCumle.length() % 2 == 0) {
       int cumleninOrtası =girilenCumle.length() / 2;


      String cumleninIlkYarısı= girilenCumle.substring(0, cumleninOrtası);
      String cumleninSonYarısı = girilenCumle.substring(cumleninOrtası);
      String cumleninSonHali = cumleninIlkYarısı+ ":)" + cumleninSonYarısı;
      System.out.println(cumleninSonHali);
      }

      // String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin}

      else {
      int cumleninOrtası= girilenCumle.length() / 2;
      String cumleninIlkYarısı = girilenCumle.substring(0, cumleninOrtası);
      String cumleninSonYarısı = girilenCumle.substring(cumleninOrtası + 1);
      String cumleninSonHali= cumleninIlkYarısı + ":(" + cumleninSonYarısı;
      System.out.println(cumleninSonHali);
     }


  }

}



