package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen sayidan başlayip
        // 7'ser 7'ser artirarak imput olarak verilen bitiş sayisina kadar
        // - tüm sayilari
        // - kac aded sayi olduğunu
        // - ve bu sayilarin toplaminin kaç olduğunu yazdirin

        int inputBas = 34;
        int inbutBit = 563;

        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inbutBit ; i+=7) {


            System.out.println(i + " ");
            sayac++;
            toplam+=i;
        }

        System.out.println("");
        System.out.println("Toplam " + sayac +"aded sayi var \nBu sayilarin toplami : " + toplam);
    }
}
