import java.util.Scanner;

public class UsluSayı {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Taban değerini giriniz: ");
            int taban = input.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int us = input.nextInt();
            int sonuc = 1;
            for (int i = 1; i <= us; i++) {
                sonuc *= taban;
            }
            System.out.println(taban + "^" + us + " = " + sonuc);
        }
    }
}
