import java.util.Scanner;

public class Enbk {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Kaç tane sayı gireceksiniz? ");
            int n = input.nextInt();

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Sayıyı giriniz: ");
                numbers[i] = input.nextInt();
            }

            int min = numbers[0];
            int max = numbers[0];

            for (int i = 1; i < n; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }

                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("En büyük sayı: " + max);
            System.out.println("En küçük sayı: " + min);
        }
    }
}
