package day07_Ternary_switchStatement;

public class C03_Ternary {
    public static void main(String[] args) {

        /*  input olarak verilen sayiyi kontrol edip
            --> ssayi cift ise ----> "cift sayi"
            --> degilse ---->  "tek sayi" yazdirin

           */

        int input=33;

        // İf else ile yapalım

        if (input%2==0){
            System.out.println("cift sayi");

        }else {
            System.out.println("tek sayi");

            // ternary ile yapalım

            System.out.println(input%2==0 ? " Cift sayi" : "Tek sayi");
        }
}
}