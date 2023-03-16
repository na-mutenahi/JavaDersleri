package day10_stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {

        // kullanicidan başlangıc ve bitiş değerlerni alip
        // bu sinirlar dahil olarak, bu sayilar arasında 5'in kati olan sayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangıc degerini giriniz");
        int baslangıc= scan.nextInt();

        System.out.println("Bitis degerini giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangıc; i <=bitis ; i++){

            if (i%5==0){
                System.out.println(i + " ");
            }
        }

    }
}
