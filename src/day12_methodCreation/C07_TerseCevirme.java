package day12_methodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {


         // Verilen bir String'i terse cevirip
        // o halini bize donduren bir method olusturun


        System.out.println(metniTerseCevir("Java candir"));
    }
    public static String metniTerseCevir(String str){

        String tersStr="";

        for (int i = str.length()-1 ; i >=0 ; i--) {

            tersStr += str.charAt(i);
        }
        return tersStr;
    }

    public static class C02_MethodOlusturma {
        public static void main(String[] args) {

            // verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun

            // bir method ancak method call yapildiginda calisir
            // method call icin method adi ve parametrelere uygun argument yazilmalidir
            // method call icerisinde yazilan variable veya degerlere argument denir

            carpYazdir(5,8); // 40.0
            carpYazdir(7.4,8.6); // 63.64

            // carpYazdir("ali","veli"); argument ve parametreler uyumlu degilse CTE olur

        }
        public static void carpYazdir(double sayi1, double sayi2){



            System.out.println(sayi1 * sayi2);


        }
    }
}
