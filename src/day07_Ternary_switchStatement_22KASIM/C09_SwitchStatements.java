package day07_Ternary_switchStatement_22KASIM;

public class C09_SwitchStatements {
    public static void main(String[] args) {
        // Kullanicidan gun numarasini alip
        // gun ismini yazdirin

        int gunNo=3;

        switch (gunNo){
            case 1:
                System.out.println("Pazareesi");
                break;

           case 2:
                System.out.println("Salı");
                break;

           case 3:
                System.out.println("Carsamba");
                break;

           case 4:
                System.out.println("Perşembe");
                break;

           case 5:
                System.out.println("Cuma");
                break;

           case 6:
                System.out.println("Cumartesi");
                break;

            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gereksiz gun numarası");

        }




    }
}
