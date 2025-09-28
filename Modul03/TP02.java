import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta dan membaca input untuk setiap variabel satu per satu
        System.out.print("Masukkan nama: ");
        String nama = input.next();

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        System.out.print("Masukkan harga per barang: ");
        int hargaPerBarang = input.nextInt();

        // Menghitung total harga
        int totalHarga = jumlahBarang * hargaPerBarang;

        // Menampilkan hasil sesuai format
        System.out.println("Hi, " + nama + ". Total belanja adalah " + totalHarga + " rupiah.");

        input.close();
    }
}