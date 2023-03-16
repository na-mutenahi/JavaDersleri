package day08_stringManipulation_23KASIM;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
        /* Kullanicidan gunu ismini girmesini isteyin,
        -->  girilen gun hafta ici bir gun ise ----> “Simdi calisma zamani tatile .. gun var”
        -->  seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        -->  girilen gun hafta sonu ise ----> “Simdi dinlenme zamani” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String girlenGun=scan.next();
        String kullanilacakGun=girlenGun.toLowerCase();

        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali vardır

           Kullanıcının girdigi degeri direk kalıcı olarak değistirmek tercih edilmez
           bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable 'a atama yapar
           ve kodlarimizda yeni variable'i kullanırız

           Konsolda yazdıracagimiz zaman, istersek kullanıcının girdigi orjinal metni yazdiririz
           istersek de bizim çevirdiğimiz hali yazabiliriz
         */

        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girlenGun + "calisma zamani,tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girlenGun + "calisma zamani,tatıle 4 gun var");
                break;
            case "carsamba":
                System.out.println(girlenGun + "calisma zamani, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girlenGun + " calisma zamani,tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girlenGun + "calisma zamani,tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlıs gun ismi");




        }

    }
}
