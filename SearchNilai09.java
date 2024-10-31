import java.util.Scanner;

public class SearchNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int bnykNilai = sc.nextInt();

        int[] nilaiMhs = new int [bnykNilai];
        int key = 78;
        int hasil = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
            for (int i = 1; i < nilaiMhs.length; i++) {
                if (key == nilaiMhs[i]) {
                    hasil = i;
                }
                else{
                    System.out.println("Nilai yang dicari tidak ditemukan");
                    break;
                }
            }
    }
}