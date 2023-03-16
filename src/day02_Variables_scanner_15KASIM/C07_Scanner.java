package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /* Soru 3- Kullanıcının ismini,soyismini ve yaşını alıp
        aşağıdaki formatta yazdırın

        İsminiz : John
        Soyisminiz : Doe
        Yaşınız : 44
        Kaydınız başarıyla tamamlanmıştır

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("lütfen soyIsminizi giriniz");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lütfen yaşınızı girini");
        int girilenYas = scan.nextInt();

        System.out.println("\nisminiz : " + girilenIsim +
                           "\nSoyisminiz : " + girilenSoyisim +
                           "\n Yaşınız : " + girilenYas +
                           "\nKaydınız başarıyla tamamlanmıştır.");











    }
}
