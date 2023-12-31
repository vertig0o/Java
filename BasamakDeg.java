import java.util.Scanner;

public class BasamakDeg {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();
            int toplam = 0;
            while (sayi != 0) {
                toplam += sayi % 10;
                sayi /= 10;
            }
            System.out.println("Basamak sayılarının toplamı: " + toplam);
        }
    }
}
