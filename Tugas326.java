import java.util.Scanner;
public class Tugas326 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int nomorToko = 1;
            int totalSeluruhBarang = 0;
            int tokoTerbanyak = 0;
            int barangTerbanyak = -1;

            while (nomorToko <= jumlahToko) {
                System.out.print("Jumlah pelanggan toko " + nomorToko + ": ");
                int jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                    sc.close();
                    return;
                }

                int totalBarangToko = 0;

                for (int i = 1; i <= jumlahPelanggan; i++) {
                    System.out.print("Jumlah barang pelanggan " + i + ": ");
                    int jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                        sc.close();
                        return;
                    }

                    totalBarangToko += jumlahBarang;
                }

                System.out.println("Toko " + nomorToko
                        + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSeluruhBarang += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = nomorToko;
                }

                nomorToko++;
            }

            System.out.println("Total barang seluruh toko: "
                    + totalSeluruhBarang);
            System.out.println("Toko dengan barang terbanyak: "
                    + tokoTerbanyak);
        }

        sc.close();
    }
}

