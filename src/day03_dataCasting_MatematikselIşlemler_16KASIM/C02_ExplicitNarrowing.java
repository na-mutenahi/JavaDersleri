package day03_dataCasting_MatematikselIşlemler_16KASIM;

public interface C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
        Eğer geniş kapasiteli bir data türünden dar kapasiteli bir data türüne
        casting yapmak isterseniz
        Java bunu otomatik olarak gerçekleştirmez, sizden sorumluluk almanızı bekler
        işlemin gerçekleşmesi için cast yapmak istediğiniz değerin önüne
        (dönüştürmek istediğimiz data türü) yazılmalıdır

        Explicit narrowing yapıldığında data kayıpları
        veya datanın beklenmedik bir sonucu dönüşmesi mümkündür
         */

        double dbl=23.5;

        int sayi= (int)dbl;
        System.out.println(sayi); // 23

        byte byt=(byte)sayi;

        System.out.println(byt); // 23

        sayi= 130;
        byt=(byte)sayi; //int daha kapsamlı olduğu için otomatik atama yapmaz,bizden mudehale ister

        System.out.println("int 130'un byte hali :"+ byt); // -126


        sayi= 256;
        byt=(byte)sayi; //int daha kapsamlı olduğu için otomatik atama yapmaz,bizden mudehale ister

        System.out.println("int 256'in byte hali :"+ byt); // 0


        sayi= 13000;
        byt=(byte)sayi; //int daha kapsamlı olduğu için otomatik atama yapmaz,bizden mudehale ister

        System.out.println("int 13000'un byte hali :"+ byt); // -56



    }
}
