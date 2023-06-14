import java.util.Scanner;

public class Bolunebilme {
    public static void main(String[] args)  { 
         try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz:");
   int k =input.nextInt();  
   
   int toplam=0;
   int adet=0;
              

   for (int i = 1; i <= k; i++){
            if (i%3==0 && i%4==0){
                            
                toplam += i;
                adet++;
               
            }
   }
   double avarage = (double) toplam / adet;
   System.out.println("12'ye bölünen sayıların toplamının ortalaması:"+ avarage);
        }

    }



}