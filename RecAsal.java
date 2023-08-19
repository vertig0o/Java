import java.util.Scanner;

public class RecAsal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false; // 1 ve negatif sayılar asal değildir.
        }
        return isAsal(sayi, 2); // İlk asal bölen 2'dir.
    }

    private static boolean isAsal(int sayi, int bölen) {
        if (bölen * bölen > sayi) {
            return true; // Hiçbir bölen bulunamazsa, sayı asaldır.
        }
        if (sayi % bölen == 0) {
            return false; // Eğer bölen sayıyı tam bölebiliyorsa, sayı asal değildir.
        }
        return isAsal(sayi, bölen + 1); // Bir sonraki böleni kontrol et.
    }
}
