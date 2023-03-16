package day06_IfElseStatement_21KASIM;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen ikizkenar ise “İkizkenar ucgen” yazdirin, degilse “İkizkenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluğunu alın");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3) ||
              (kenar2==kenar1 && kenar2!=kenar3) ||
              (kenar3==kenar1 && kenar3!=kenar2 )) {
            System.out.println("İkizkenar Üçgen");

        } else{
            System.out.println("İkizkenar değil");





    }

}
}