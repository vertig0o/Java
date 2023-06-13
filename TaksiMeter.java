import java.util.Scanner;
public class TaksiMeter {
  public static void main(String[] args)   {
    double perKm = 2.20, total , startPrice = 10;
    int km;
    try (Scanner input = new Scanner(System.in)) {
      km = input.nextInt();
    }
    total =(km * perKm);
    total += startPrice;


    total = (total < 20 ) ? 20 : total;
    System.out.println("Toplam tutar :" + total);
    }
}
