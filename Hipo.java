import java.util.Scanner;
public class Hipo {
    public static void main(String[] args) {
        
      int a, b;
        double c;
       try (Scanner girdi = new Scanner  (System.in)) {
        System.out.print("1. Kenarı giriniz:  " );
          a = girdi.nextInt();
        
         System.out.print("2. Kenarı giriniz:  " );
         b = girdi.nextInt();
    }
             
        c = Math.sqrt((a*a) +(b*b));
        System.out.println("Hipotenüs :" + c);
        }
     
}
