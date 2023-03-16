package day07_Ternary_switchStatement_22KASIM;

public class C11_SwitchCase {
    public static void main(String[] args) {
        // Kullanicidan İSTQB kisaltmasindan hangi harfin anlamini öğrenmek istediğini alın
        // ve girilen harfin karsiligini yazdırın
        // I : International  S : Software  T : Testing  Q : Qualifications  B : Board

        char harf='S';

        switch (harf){

            case 'I':
            case 'ı':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yanlıs harf seçimi");
        }
    }
}
