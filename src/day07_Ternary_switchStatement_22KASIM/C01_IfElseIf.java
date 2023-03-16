package day07_Ternary_switchStatement_22KASIM;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

         /* kullanicidan bir tamsayi alin

           --> sayi rakam ise ---->  "girilen sayi rakam"
           --> sayi 2 basamakli ise ---->  "girilen sayi 2 basamakli"
           --> sayi 2 basamaktan buyukse ----> "buyuk sayi" yazdirin

           NOT: BİZDEN NE İSTENİYORSA O YAZILACAK!!
         */

        /*
          ÖENLİ NOT!
          Eger if else cumleleri ELSE ile bitmiyorsa
          tum durumlari kapsamaz
          yani bazi degerler icin hic bir if body'si calismayabilir
          Bu tur sorulari cozerken
          sartlarin tamamini dikkatli yazmak gerekir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();

        if (0<=girilenSayi && girilenSayi<=9) System.out.println("Girilen sayi rakamdir");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("Girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("Büyük rakam");

    }
}
