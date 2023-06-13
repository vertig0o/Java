import java.util.Scanner;
public class Manav {
     public static void main(String[] args){
        
        double toplamFiyat , ArmutF = 2.14 , ElmaF = 3.67 , DomatesF = 1.11 , MuzF = 0.95, PatlicanF = 5.00;
           

       try (Scanner inpM = new Scanner(System.in)) {
        System.out.print("Armut Kaç Kilo ? : ");
        ArmutF *= inpM.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        ElmaF*= inpM.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        DomatesF *= inpM.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        MuzF *= inpM.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        PatlicanF *= inpM.nextDouble();
    }

        toplamFiyat = ArmutF + ElmaF + DomatesF +  MuzF + PatlicanF;

        System.out.print("Toplam Ödemeniz gereken Tutar :" + toplamFiyat + "TL'dir");
     }
}
