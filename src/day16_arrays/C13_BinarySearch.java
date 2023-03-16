package day16_arrays;

import java.util.Arrays;

public class C13_BinarySearch {
    public static void main(String[] args) {

        // binary tree javanin kullandigi özel bir siralama yöntemidir
        // binarySearch method'u binaryTree özelligini kullandigindan
        // sirali olmayan arry'lerde dogro sonuc dondurmeyebilir
        // Eger binarySearch() kullanilacaksa
        // oncesinde MUTLAKA sort() kullanilmalidir.


        int[] arr={2,6,9,3,15,1,7};

        System.out.println(Arrays.binarySearch(arr, 7));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1,2,3,6,7,9,15]


    }
}
