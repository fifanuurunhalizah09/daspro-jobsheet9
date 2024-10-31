
import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan JUmlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0, rataNilaiLulus, rataNilaiTidaklulus;
        int nilaiLulus = 0, nilaiTidakLulus = 0, jmlLulus = 0, jmlTidaklulus = 0;

    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.print("Masukkan Nilai Mahasiswa ke- " + (i + 1) + " : ");
        nilaiMhs[i] = sc.nextInt();
        if (nilaiMhs[i] > 70) {
            jmlLulus++;
            nilaiLulus += nilaiMhs[i];
        } else {
            jmlTidaklulus++;
            nilaiTidakLulus += nilaiMhs[i];
        }
    }
    rataNilaiLulus = nilaiLulus / jmlLulus;
    rataNilaiTidaklulus = nilaiTidakLulus / jmlTidaklulus;
    System.out.println("Rata - Rata Nilai Lulus = " + rataNilaiLulus); 
    System.out.println("Rata - Rata Nilai Tidak Lulus = " + rataNilaiTidaklulus);
    }
}
