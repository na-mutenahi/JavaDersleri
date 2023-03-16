package day16_arrays;

public class C06_Soru {
    public static void main(String[] args) {


        // Bir marketin fiyatlarini tutan bir array var
        // Bu marketteki en yuksek ve en dusuk fiyatlari yazdiran bir method olusturun

        double[] fiyatlar={23, 34.5, 42.1, 5.7, 3.4, 23.5};

        enYuksekEnDusukFiyatYazdir(fiyatlar);
    }

    public static void enYuksekEnDusukFiyatYazdir(double[] fiyatlar){

        double enDusukFitat=fiyatlar[0];
        double enYuksekFiyat=fiyatlar[0];

        for (int i = 0; i < fiyatlar.length; i++) {

            if (fiyatlar[i]< enDusukFitat){
                enDusukFitat=fiyatlar[i];
            }

            if (fiyatlar[i]>enYuksekFiyat){
                enYuksekFiyat=fiyatlar[i];
            }
        }

        System.out.println("Listedeki en dusuk fiyar : " + enDusukFitat);
        System.out.println("Listeteki en yuksek fiyat : " + enYuksekFiyat);
    }
}
