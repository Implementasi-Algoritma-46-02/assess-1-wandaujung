import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan deret angka (pisahkan dengan spasi): ");
        String deretAngka = scanner.nextLine();

        String[] angkaArray = deretAngka.split(" ");
        boolean valid = true;

        for (String angka : angkaArray) {
            if (angka.length() != 3 || angka.charAt(0) == angka.charAt(1)) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("Deret angka valid");
        } else {
            System.out.println("Deret angka tidak valid");
        }
    }
}