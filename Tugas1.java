import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, jumlahTiket = 0, totalTiket = 0, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik (0) untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                System.out.println("Transaksi selesai");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            } 
            int totalBeli = jumlahTiket*hargaTiket;
            double diskon = 0;
            
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            int potongan = (int) (totalBeli*diskon);
            int totalBayar = totalBeli - potongan;
            
            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
            
            System.out.println("Total Pembelian : "+ totalBeli);
            System.out.println("Diskon          : "+ (int) (diskon*100) + " %");
            System.out.println("Total Pembayaran: "+ totalBayar);
            System.out.println();
        } while (true);

        System.out.println("===REKAP PENJUALAN SEHARI===");
        System.out.println("Total tiket yang terjual: "+ totalTiket);
        System.out.println("Total Pendapatan        : "+ totalPenjualan);
    }
}
