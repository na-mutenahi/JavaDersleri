package Alıstırmalar;

public class replace_01 {
    public static void main(String[] args) {

        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        // input : java1 ogRe2@nMek3 #ne +Gu=zel
        // output : Java ogrenmek ne guzel.

        String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replaceAll("\\d" ,"");

        input=input.replace(" ", "C");

        input=input.replaceAll("\\W" , "");

        input=input.replace("C", " ");

        input=input.toLowerCase();

        input=input.replaceFirst("j", "J");

        System.out.println(input);






    }
}
