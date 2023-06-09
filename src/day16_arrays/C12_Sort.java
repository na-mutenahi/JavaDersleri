package day16_arrays;

import java.util.Arrays;

public class C12_Sort {
    public static void main(String[] args) {

        // verilen bir Array'i Natural Order'a gore siralayip yazdirin

        String[] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said","Mahmut","ahmet","adnan"};

        System.out.println(Arrays.toString(isimler)); // [Huseyin, Yusuf, Mehmet, Akile, Said,Mahmut, ahmet, adnan]

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Akile, Huseyin, Mahmut, Said, Yusuf, adnan, ahmet]


        // Eger büyükten kucuge siralamak istersek, once sort kullanarak natural order'a göre siralar
        // sonra gecici bir array kullanarak siralamayi terse ceviririz

    }
}
