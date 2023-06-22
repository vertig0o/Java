import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
         int n  ;
    try (Scanner inp = new Scanner(System.in)) {
        System.out.print("n:");
                  n=inp.nextInt();
    }
      for(int i=n;i>=0;i--){
               for(int j=1;j <=n-i;j++){
                   System.out.print(" ");
               }
               for(int k=1;k<=(2*i)-1;k++){
               System.out.print("*");
                }
               System.out.println();

    }
     }}
