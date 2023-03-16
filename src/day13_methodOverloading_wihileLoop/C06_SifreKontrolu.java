package day13_methodOverloading_wihileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartları kontreol edin
        // ve kullaniciya düzeltmesi gereken tüm eksikleri söyleyin,
        // eger tüm sartlari, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk olmalı
        // - son karakter rakam olmalı
        // - sifre bosluk icermemeli
        // - uzunluğu en az 10 karakter olmali

        // sifte kontrolunu bir method'da yapip true / false dondurun
        // main method'da donen sonucu kontrol edip
        //"basari ile olusturuldu" yazıncaya kadar
        // sifreyi tekrar isteyin


       sifreKontrolu();

    }public static boolean sifreKontrolu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre= scan.nextLine();
    int flag = 0;
    // - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) < 'z')) {
        // ilk harf kucuk degilse hatayi yazdir
        // sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
        System.out.println("Ilk harf kucuk harf olmali");
        flag++; // bir ceza puani aldi
    }
    // - son karakter rakam olmali
       if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
        // son karakter rakam degilse rapor yazdir
        System.out.println("Son karakter rakam olmali");
        flag++;
    }
    // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
        System.out.println("Sifre bosluk icermemeli");
        flag++;
    }
    // - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
        System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
        flag++;
    }
       if (flag==0){
        System.out.println("sifreniz basariyla kaydedildi");
    }  if  (flag!=0) System.out.println("Lutfen tekrar yeni sifre giriniz");
  return true;



    }
}
