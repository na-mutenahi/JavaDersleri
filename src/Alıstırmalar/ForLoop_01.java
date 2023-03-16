package Alıstırmalar;

import java.util.Scanner;

public class ForLoop_01 {
    public static void main(String[] args) {


        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String girilenKelime=scan.nextLine();
        String kelimeninTersi="";

        //  zeynep-penyez

        for (int i = girilenKelime.length()-1; i>=0 ;i--){
            kelimeninTersi=kelimeninTersi + girilenKelime.substring(i,i+1);
        }
        System.out.println(kelimeninTersi);
    }
}
