import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta dan membaca input untuk setiap variabel satu per satu
        System.out.print("Masukkan jumlah permen: ");
        int jumlahPermen = input.nextInt();

        System.out.print("Masukkan jumlah teman: ");
        int jumlahTeman = input.nextInt();

        // Total orang adalah Dira + teman-temannya
        int totalOrang = jumlahTeman + 1;

        // Menghitung permen yang didapat tiap orang
        int permenPerOrang = jumlahPermen / totalOrang;

        // Menghitung sisa permen
        int sisaPermen = jumlahPermen % totalOrang;

        // Menampilkan hasil
        System.out.println("Setiap orang mendapat: " + permenPerOrang + " permen");
        System.out.println("Sisa permen: " + sisaPermen);

        input.close();
    }
}