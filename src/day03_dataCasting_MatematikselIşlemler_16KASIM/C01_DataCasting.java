package day03_dataCasting_MatematikselIşlemler_16KASIM;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*
        Srting str= 23;
        int sayi="Merhaba Java";
        char ilkHarf=true


         */
        short sayi2= 45;

        int sayi3= sayi2;
        // int  = short değerin kapasitesi variable'in kapasitesinden küçük olduğundan sorun yok

        int sayi4=45;

        double sayi5=sayi4;
        // double  = int değerin kapasitesi variable' in kapasitesinden küçük olduğundan sorun yok

        double sayi6= sayi5;
        // int sayi7= sayi6;
        // int      = double   double olan değerin kapasitesi,int olan variable'in kapasitesinden büyük
        //                      java otomatik çevirme yapmaz

        int sayi8=99;
        // byte sayi9=sayi8;


    }
}
