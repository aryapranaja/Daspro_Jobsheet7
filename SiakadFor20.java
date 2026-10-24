import java.util.Scanner;

public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0, jmlTidakLulus = 0; // Untuk soal pertanyaan nomor 4
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            // Tambahan untuk Pertanyaan No. 4 (Batas lulus minimal 60)
            if (nilai >= 60) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jmlTidakLulus);
        
        sc.close();
    }
}
