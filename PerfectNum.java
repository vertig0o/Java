import java.util.Scanner;

public class PerfectNum   {
    public static void main(String[] args) {
        int n,i,counter=0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
        }
        for(i=1; i<n; i++){
            if(n%i == 0){
                counter+=i;
            }
        }
        if(counter == n){
            System.out.print(  n  + "  mükemmel sayıdır.");
        }
        else{
            System.out.print(  n + "  mükemmel sayı değildir. ");
        }
    }
}