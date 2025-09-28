import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta dan membaca input untuk setiap variabel satu per satu
        System.out.print("Masukkan modal awal: ");
        int modalAwal = input.nextInt();

        System.out.print("Masukkan tabungan per hari: ");
        int tabunganPerHari = input.nextInt();

        System.out.print("Masukkan lama menabung (hari): ");
        int lamaMenabung = input.nextInt();

        // Menghitung total tabungan
        int totalTabungan = modalAwal + (tabunganPerHari * lamaMenabung);

        // Menampilkan hasil akhir
        System.out.println("Jumlah uang tabungan Dira adalah: " + totalTabungan);

        input.close();
    }
}