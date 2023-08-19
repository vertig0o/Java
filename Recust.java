import java.util.Scanner;

public class Recust{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üssü girin: ");
        int us = scanner.nextInt();

        long sonuc = usluSayiHesapla(taban, us);
        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close();
    }

    public static long usluSayiHesapla(int taban, int us) {
        if (us == 0) {
            return 1; // Herhangi bir sayının 0 üssü 1'dir.
        } else {
            return taban * usluSayiHesapla(taban, us - 1);
        }
    }
}

