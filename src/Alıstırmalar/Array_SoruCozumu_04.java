package Alıstırmalar;

public class Array_SoruCozumu_04 {
    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var
        // olup olmadigini ve varsa kac kere
        // kullanildigini yazdirin

         int [] arr= {2,4,6,8,1,3,7,7,5,7,9,};
         int sayi=10;
         int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (sayi==arr[i])
                sayac ++;
        }
        if (sayac==0)
            System.out.println(sayi + " listede yoktur " );
        else System.out.println(sayi + " ,  " +  sayac + " kere kullanilmistir" );


    }
}
