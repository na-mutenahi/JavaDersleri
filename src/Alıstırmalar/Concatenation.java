package Alıstırmalar;

public class Concatenation {
    public static void main(String[] args) {

        int h=15;
        int y=30;
        String str4= "";
        String str5= " ";
        String str6= "-";

        System.out.println(h+y);//45
        System.out.println(str4+h+y); // "" + 15 + 30 ==> "15" + 30 ==> 1530
        System.out.println(h+str5+y); // 15 + " " + 30 ==> "15 " + 30 ==> "15 30"
        System.out.println(h+y+str6); // 15 + 30 + "-" ==> 45 + "-" ==> "45-"
        System.out.println(str4+h*y); // "" + 15 * 30 ==> "" + 450 ==> "450"
        System.out.println(str5+(h+y));// " " + (15+30) ==> " " + 45 ==> " 45"

        // System.out.println(str1-a);  + disinda hic bir islem String'le kullanilamaz

        int z=5;
        int i=10;
        String inci1="";
        String inci2=" ";
        String inci3="-";

        System.out.println(z+i); // 15
        System.out.println(inci1+z+i); // "" + 5 + 10 ==> "5" + 10 ==> "510"
        System.out.println(z+inci2+i); // 5 + " " + 10 ==> "5 " + 10 ==> "5 10"
        System.out.println(z+i+inci3); // 5 + 10 + "-" ==> 15 + "-" ==> "15-"
        System.out.println(inci3+z*i); // "-" + 5 * 10 ==> "-" + 50 ==> "-50"
        System.out.println(inci2+(z+i)); // " " + 5 + 10 ==> " " + 15 ==> " 15"

    }
}
