import java.util.Scanner;

public class TekSayılar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;
            int number;
            do {
                System.out.print("Bir sayı giriniz: ");
                number = input.nextInt();
                if (number % 2 == 0 && number % 4 == 0) {
                    sum += number;
          }else{
                     System.out.print("Tek sayı girdiniz.");
                     break;
                    }
                
            } while (number > 0);
            System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
        }
    }
}