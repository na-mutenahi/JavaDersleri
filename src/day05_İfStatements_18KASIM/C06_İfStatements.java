package day05_İfStatements_18KASIM;

import java.util.Scanner;

public class C06_İfStatements {
    public static void main(String[] args) {

         //  Soru 4- Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        // Eşkenar üçgen yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir üçgenin 3 kenar uzunluğunu giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0);{
            System.out.println();
            System.out.println("Eşkenar üçgen");
    }

}
}

