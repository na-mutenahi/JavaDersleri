package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        // bu metindeki sayılardan kurtulun

        String str= "Ja1va 56Guz,el-dir";

        System.out.println(str.replace("1", "")
                              .replace("5","")
                              .replace("6",""));

        str= "Ja1va4 56G7u,z9el-dir8";


        /*
           replace() zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar

           eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri
           gibi genisletmek istersek replace() yerine replaceAll() kullaniriz

           Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir

           \\d : bütün digit'ler

         */
        str=str.replaceAll("\\d","");
        System.out.println(str); //Java Guz,zel-dir

        // ozel karakterlerden kulrtulun
        // space de ozel kararkter oldugundan bu durumda space 'in yok olmaması için
        // once space yerine olmayan bir deger atayalım



        str=str.replace(" ","5");

        str=str.replaceAll("\\W",""); // JavaGuzeldir

        str=str.replace("5"," ");

        System.out.println(str);

        // buradaki harf sayısını bulum

        String input3="Ali Can, Merve Star, Mark Tom";

        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length()); // 22







    }
}
