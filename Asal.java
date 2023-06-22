 
import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz: ");
            int num = input.nextInt();

            for(int i = 2; i <= num; i++)  
            {
                int factorCount = 0;
                for(int i2= 2; i2<i; i2++)  
                {
                    if(i % i2 == 0) factorCount++;
                }

                if(factorCount == 0) System.out.print(i + " ");
            }
        }
    }
   
    
}
