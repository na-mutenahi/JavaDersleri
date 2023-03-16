package day18_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        // verilen bir array'deki tekrar eden elementleri silip
        // array'i unige değerlerinden oluşan bir array haline getirin

        int[] arr = {4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        // insan olarak bu elementleri benzersiz elementler yapabilirmiyiz?
        // benzersiz elementler ={4,3,6,7,5}
        // peki kodlarla yapabilir miyiz?

        List<Integer> benzersizElemetlerList = new ArrayList<>();

        // array'deki tüm elementleri alıp
        // listede var mı diye kontrol edelim
        // ve almayanlari ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!benzersizElemetlerList.contains(arr[i])){

                benzersizElemetlerList.add(arr[i]);
            }

        }
        System.out.println(benzersizElemetlerList); // [4, 3, 6, 7, 5]

        // soruda bu degerleri arr'ye atamamiz isteniyor

        arr= new int[benzersizElemetlerList.size()]; //

        for (int i = 0; i < arr.length; i++) {

            arr[i]= benzersizElemetlerList.get(i);

        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr)); // Array'in son hali : [4, 3, 6, 7, 5]
    }


}
