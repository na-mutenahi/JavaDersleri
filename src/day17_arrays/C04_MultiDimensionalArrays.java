package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{ 1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length); //5
        System.out.println(arr[2].length); // 4

        System.out.println(arr[2][1]);// 7

        System.out.println(arr[3]); // [I@2f92e0f4

        // Multi dimensional array ile çalışırkem dikkat etmeniz gereken en önemli konu
        // yazdigimiz kodu bir array mi yoksa yazdirabilecegimiz bir element mi dondurdugudur

        System.out.println(Arrays.toString(arr[3])); //[2]

        // 21.SATİRDAKİ 2 ELEMENTİ YAZDİRMAK İSTERSEK

        System.out.println(arr[3][0]); // 2

        // MDA'in tumunu yazdırmak isterseniz
        // tek katlı arrayleri yazdırmak için kullandıgımız yöntem yeterli olmaz

        System.out.println(Arrays.toString(arr)); // [[I@28a418fc, [I@5305068a, [I@1f32e575, [I@2f92e0f4, [I@279f2327]


        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]


    }
}