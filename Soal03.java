import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam awal (H): ");
        int jamAwal = scanner.nextInt();

        System.out.print("Masukkan menit awal (M): ");
        int menitAwal = scanner.nextInt();

        System.out.print("Masukkan menit yang akan ditambahkan (V): ");
        int menitTambahan = scanner.nextInt();

        int totalMenit = menitAwal + menitTambahan;

        int jamTambahan = totalMenit / 60;
        int sisaMenit = totalMenit % 60;

        int totalJam = jamAwal + jamTambahan;

        System.out.println("Hasil penjumlahan: " + totalJam + ":" + sisaMenit);
    }
}