
import java.util.Scanner;

public class TugasN01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilai = new int[jumlahMahasiswa];
        int totalNilai = 0;
        double rataRata;

        System.out.println("Masukkan nilai setiap mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        for (int nilaiMahasiswa : nilai) {
            totalNilai += nilaiMahasiswa;
        }
        rataRata = (double) totalNilai / jumlahMahasiswa;

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int nilaiMahasiswa : nilai) {
            if (nilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa;
            }
            if (nilaiMahasiswa < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa;
            }
        }
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.print("Semua nilai: ");
        for (int nilaiMahasiswa : nilai) {
            System.out.print(nilaiMahasiswa + " ");
        }
    }
}
