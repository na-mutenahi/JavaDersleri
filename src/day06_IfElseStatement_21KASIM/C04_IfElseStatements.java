package day06_IfElseStatement_21KASIM;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args){

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");

        char girilenHarf=scan.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<='Z'){
            System.out.println("Girilen harf büyük harf");
        }else System.out.println("Girilen karekter büyük harf değildir");
    }
 }