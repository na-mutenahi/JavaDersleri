package Alıstırmalar;

public class ForLoop_SoruCozumu_02 {
    public static void main(String[] args) {

         /*Soru-28)
          Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
          Örnek:
          Sayı: 1238
          Sayının Tersi: 8321
          İpucu:  Loop kullanabilirsiniz.

           */
        String input="453245567";
        String inputTersi="";

        for (int i = input.length()-1; i>=0; i--) {
            inputTersi=inputTersi + input.substring(i,i+1);

        }
        System.out.println(inputTersi);


    }
}




