package day10_stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {

        // 1 ile 1000 arasındaki sayilari yanyana yazdirin
        // yazdirma işlemi bittiğinde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin

        int sayilarinToplami=0;

        for (int i =1; i <=1000 ; i++){

            System.out.println(i + " ");

           // sayilarinToplami= sayilarinToplami+i;
            sayilarinToplami +=i;
        }

        System.out.println("");
        System.out.println("tum sayilarin toplami = " + sayilarinToplami);



    }
}
