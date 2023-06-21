import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("N değerini giriniz: ");
            int n = input.nextInt();
            System.out.print("R değerini giriniz: ");
            int r = input.nextInt();
            int nFaktoriyel = 1;
            int rFaktoriyel = 1;
            int nMinusRFaktoriyel = 1;
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
                if (i <= r) {
                    rFaktoriyel *= i;
                }
                if (i <= n - r) {
                    nMinusRFaktoriyel *= i;
                }
            }
            int c = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
            System.out.println("C(" + n + "," + r + ") = " + c);
        }
    }
}
