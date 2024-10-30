
import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlaLulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan Nilai Mahasiswa ke- " + i + " : ");
        nilaiMhs[i] = sc.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
        if (nilaiMhs[i] > 70) {
            jumlaLulus++;
        }
    }
    rata2 = total/nilaiMhs.length;
    System.out.println("Rata - Rata Nilai = " + rata2); 
    System.out.println("Jumlah Mahasiswa yang Lulus = " + jumlaLulus);
    }
}
