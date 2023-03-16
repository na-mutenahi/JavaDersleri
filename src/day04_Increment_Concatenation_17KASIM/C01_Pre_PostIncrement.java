package day04_Increment_Concatenation_17KASIM;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi=20;

        // sayıyı 3 artırın

        sayi= sayi+3;
        sayi +=3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi); //29

        // sayının değerini 2 azaltın

        sayi = sayi - 2;

        sayi -=2;

        sayi--;
        sayi--;

        System.out.println(sayi); //23

        sayi=10;
        // sayıyı önce yazdırın, sonra 1 azaltın

        sayi--;
        System.out.println(sayi); // 9
        // bu işlemde ekranda gördüğümüz 9, sayısınındeğeri 9
        System.out.println(sayi); // 9

        sayi=10;
        // sayıyı once yazdırın.sonra 1 azaltın

        System.out.println(sayi); //10
        sayi--;

        // ekranda görülen 10,ama sayının son değeri 9
        System.out.println(sayi); // 9



        sayi=10;
        sayi++; // sayıyı 1 artırır
        ++sayi; // sayıyı 1 artırır
        System.out.println(sayi); // 12


        sayi=10;
        System.out.println(sayi++); // 10
        // Java aynı satırda  iki işlem olduğundan sıralama yapar
        // eğer ++ variable'dan sonra ise artırma işlemini sonra yapar
        // bu durumda önce yazdırma,sonra artırma işlemi

        System.out.println(sayi); // 11



        sayi=10;
        System.out.println(++sayi); // 11
        // ++ variable'dan önce ise artırma işlemini önce yapar
        // bu durumda lava önce artırma sonra yazdırma işlemi yapar

        System.out.println(sayi); // 11


        int sayi1=25;
        int sayi2=sayi1++;
        int sayyi3=--sayi2;
        int sayi4=--sayi1;
        System.out.println(sayi1 + ", " +sayi2 + ", " + sayyi3 + ", " + sayi4);












    }
}
