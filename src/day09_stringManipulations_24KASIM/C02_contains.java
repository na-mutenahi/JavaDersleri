package day09_stringManipulations_24KASIM;

public class C02_contains {
    public static void main(String[] args) {

        String str= "Java ogren, mutlu ol";

        // str mutlu iceriyor mu?
        System.out.println(str.contains("mutlu")); // true

        // charSequens : char dizisi


        System.out.println(str.contains("j")); // false
        System.out.println(str.contains(" ")); // true

        // contains method'u kaç tane olduguna degill
        // sadece var olup olmadıgina bakar

        System.out.println(str.contains("Java") && str.contains("mutlu"));

    }
}
