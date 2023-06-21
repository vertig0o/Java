import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();
            double harmonikSeri = 0;
            for (double i = 1; i <= sayi; i++) {
                harmonikSeri += 1 / i;
            }
            System.out.println("Harmonik Seri: " + harmonikSeri);
        }
    }
}
