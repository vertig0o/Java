import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();
            for (int i = 1; i <= number; i++) {
                System.out.println("4^" + i + " = " + Math.pow(4, i));
                System.out.println("5^" + i + " = " + Math.pow(5, i));
            }
        }
    }
}
