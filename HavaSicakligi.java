import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int heat;

            System.out.print("Hava sıcaklığını dahil ediniz: ");
            heat = inp.nextInt();

            if (heat<5){
                System.out.print("Kayak yapabilirsiniz");
            }
            else if (heat>=5 && heat<10) {
                System.out.print("Sinemaya gidebilirsiniz");
            }
            else if(heat>=10 && heat<=15){
                System.out.print("Hem sinemaya hem de pikniğe gidebilirsiniz");
            }
            else if (heat>15 && heat<=25){
                System.out.print("Pikniğe gidebilirsiniz");
            }
            else {
                System.out.print("Yüzmeye gidebilirsiniz");
            }
        }
    }
}