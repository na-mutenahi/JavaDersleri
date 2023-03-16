package Alıstırmalar;

import java.util.Scanner;

public class ForLoop_SoruCozumu_01 {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle=scan.nextLine();
        String cumleninTersi="";

        // Her doğru her yerde söylenmez.

        for (int i = girilenCumle.length()-1; i>=0 ; i--) {
            cumleninTersi=cumleninTersi + girilenCumle.substring(i,i+1);
        }
        System.out.println(cumleninTersi);

        System.out.println();







    }
}
