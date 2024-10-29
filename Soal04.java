import java.util.Scanner;

public class Soal04 {

    public static double hitungHonor(String kodePosisi, int jumlahJamKerja) {
        double honorPerJam = 30000;
        double tunjangan = 0;
        double bonus = 0;

        switch (kodePosisi) {
            case "DES":
                tunjangan = 600000;
                break;
            case "PRG":
                tunjangan = 1200000;
                break;
            case "WRT":
                tunjangan = 400000;
                break;
            case "MKT":
                tunjangan = 200000;
                break;
            default:
                System.out.println("Kode posisi tidak valid.");
                return 0;
        }

        double honorPokok = jumlahJamKerja * honorPerJam;
        double totalHonor = honorPokok + tunjangan;

        if (jumlahJamKerja > 160) {
            bonus = totalHonor * 0.05;
        } else if (jumlahJamKerja > 175) {
            bonus = totalHonor * 0.07;
        }

        return totalHonor + bonus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode posisi karyawan: ");
        String kodePosisi = scanner.nextLine();

        System.out.print("Masukkan jumlah jam kerja dalam satu bulan: ");
        int jumlahJamKerja = scanner.nextInt();

        double totalHonor = hitungHonor(kodePosisi, jumlahJamKerja);

        System.out.println("Total honor karyawan: Rp " + totalHonor);
    }
}