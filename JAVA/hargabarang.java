import java.util.Scanner;

public class hargabarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon = 0;

        if (total > 26.100) { 
            diskon = total * 0.010;
        }

        double totalBayar = total - diskon;

        System.out.println("\nSTRUK PEMBELIAN");
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Satuan: " + harga);
        System.out.println("Jumlah Beli: " + jumlah);
        System.out.println("Total Harga: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("SELESAI");

        input.close();
    }
}
