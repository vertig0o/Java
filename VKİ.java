import java.util.Scanner;
public class VKİ {
    public static void main(String[] args){
double index;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Lütfen kilonuzu giriniz: ");
            double kg=sc.nextDouble();


            System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");

            double boy=sc.nextDouble();

            index=kg/(boy*boy);
        }

        System.out.println("Vücut kütle indexiniz = "+index);


    }
}
