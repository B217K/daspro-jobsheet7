
import java.util.Scanner;

public class SiakadWhile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml,i;
        
        System.out.print("Masukkan jumlah mahasiswa   : ");
        jml = sc.nextInt();
        i=0;
        while (i<jml) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +": ");
            nilai = sc.nextInt(); 

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan lagi nilai yang valid!");
                continue;
            }
            if (80 < nilai && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah A");
            } else if (73 < nilai && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah B+");
            } else if (65 < nilai && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah B");
            } else if (60 < nilai && nilai  <= 65) {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah C+");
            } else if (50 < nilai && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah C");
            } else if (35 < nilai && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) +" adalah E");
            }
            i++;
        }
    }
}
