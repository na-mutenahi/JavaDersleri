package day02_Variables_scanner_15KASIM;

import java.util.Scanner;

public class C012_SoruÇözümü {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyisim=scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int girilenYaş= scan.nextInt();

        System.out.println("Isminiz " + girilenIsim +
                            "\nSoyismini " + girilenSoyisim +
                            "\nYaşınız " + girilenYaş +
                            "\nKaydınız başarıyla tamalanmıştır");
    }





    /* Soru 3- Kullanıcının ismini,soyismini ve yaşını alıp
        aşağıdaki formatta yazdırın

        İsminiz : John
        Soyisminiz : Doe
        Yaşınız : 44
        Kaydınız başarıyla tamamlanmıştır


     */



}
