import java.util.Scanner;

public class RecNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        islemYap(sayi);

        scanner.close();
    }

    public static void islemYap(int sayi) {
        if (sayi <= 0) {
            System.out.println("Son değer: " + sayi);
        } else {
            System.out.println("Çıkarma sonucu: " + sayi);
            islemYap(sayi - 5);
            System.out.println("Ekleme sonucu: " + sayi);
        }
    }
}
