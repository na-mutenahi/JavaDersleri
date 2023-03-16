package Alıstırmalar;

public class IastIndexOf_02 {
    public static void main(String[] args) {

        String input2="Hayat sevince guzel ama sevince guzel";
        String aranacakMetin2="guzel";
        int ilkGuzelIndex=input2.indexOf("guzel");
        int sonGuzelIndex=input2.lastIndexOf("guzel");

        if (!(input2.contains("guzel"))) System.out.println("Guzel kelimesi kullanilmamis");
        else if (ilkGuzelIndex==sonGuzelIndex) {
            System.out.println("Guzel bir kere kullanilmis");
        } else if (!(ilkGuzelIndex==sonGuzelIndex)) {
            System.out.println("Guzel kelimesi birden fazla kullanilmistir");
        } else System.out.println("Gecersiz islem");


    }
}
