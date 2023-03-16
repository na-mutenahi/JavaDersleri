package Alıstırmalar;

import java.util.Scanner;

public class switchcase_soru1 {
    public static void main(String[] args) {

        // Kullanıcıdan gün numarasını alıp haftaiçi yada haftasonu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gün sayısı giriniz");
        int gUnSayısı=scan.nextInt();

        switch (gUnSayısı){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("geçersiz giriş");

        }



    }
}
