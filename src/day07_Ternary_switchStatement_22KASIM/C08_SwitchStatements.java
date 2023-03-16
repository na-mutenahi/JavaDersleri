package day07_Ternary_switchStatement_22KASIM;

public class C08_SwitchStatements {
    public static void main(String[] args) {
         /* Kullanicidan 2 sayi alin
         --> ve kullaniciya istedigi islemi sorun ----> +, - , * , / isaretlerinden hangisini girerse
         --> 2 sayi icin o islemi yapin
         --> bu isaretlerden birini girmezse ----> "yanlis islem tercihi" yazdirin
          */
        int sayi1=20;
        int sayi2=10;

        char islem='+';

        // If else ile yapalım

        if (islem=='+'){
            System.out.println("sayiların toplami :" + (sayi1+sayi2));

        } else if (islem=='-') {
            System.out.println("sayilarin farki : " + (sayi1-sayi2));

        } else if (islem=='*') {
            System.out.println("sayiların çarpımı " + (sayi1*sayi2));

        } else if (islem=='/') {
            System.out.println("sayiların bölümü " + (sayi1/sayi2));

        }else {
            System.out.println("yanlıs islem tercihi");
        }

        // Switch satenment ile yapalım

        System.out.println("===========");

        switch (islem){
            case '+':
                System.out.println("sayiarın toplami : " + (sayi1+sayi2));
                break;
            case '-':
                System.out.println("sayiların farki : " + (sayi1-sayi2));
                break;
            case '*':
                System.out.println("sayiların çarpımı "  + (sayi1*sayi2));
                break;
            case '/':
                System.out.println("sayilaribn bölümü " + ( sayi1/sayi2));
                break;
            default:
                System.out.println("yanlis islem tercihi");
        }



        }



}
