import java.util.Scanner;

public class TugasNo2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Pesanan ke-" + (i+1) + ": ");
            namaPesanan[i] = input.next();
            System.out.print("Harga: ");
            hargaPesanan[i] = input.nextDouble();
        }
        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}