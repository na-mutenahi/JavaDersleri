package day06_IfElseStatement_21KASIM;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("Eşkenar üçgendir");
        } else {
            System.out.println("eşkenar değildir");
    }

        /*
           ÖNEMLİ NOT!!
           If ile başlayan bir kod else ile bitiyorsa
           input'un tüm değerlerini kapsar
           Yani her değer için mutlaka kodumuzda bir bdy çalışır
        */




    }

}

