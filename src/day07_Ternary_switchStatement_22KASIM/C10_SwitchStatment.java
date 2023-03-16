package day07_Ternary_switchStatement_22KASIM;

public class C10_SwitchStatment {
    public static void main(String[] args) {

        // Kullanıcidan gun numarasi alın
        // hafta içi veya hafta sonu olsugunu yazdırın

        int gunNo=5;

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafata ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Geçersiz gun numarası");

        }
    }
}
