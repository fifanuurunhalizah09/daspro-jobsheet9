import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
    
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = input.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan " + makananDicari + " tersedia.");
        } else {
            System.out.println("Makanan " + makananDicari + " tidak tersedia.");
        }
    }
}