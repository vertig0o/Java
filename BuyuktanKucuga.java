import java.util.Scanner;
public class BuyuktanKucuga {
     public static void main(String[] args) {
    int a , b ,c ;

    try (Scanner input = new Scanner(System.in)) {
        System.out.print("1. sayı :");
        a = input.nextInt();
        
        System.out.print("1. sayı :");
        b = input.nextInt();

        System.out.print("1. sayı :");
        c = input.nextInt();

    }

    if((a < b) && (a < c)){
        if ( b < c) {
            System.out.println("a < b < c");
        } else {
            System.out.println("a < c < b");
        }
    } else if (( b < a) && ( b < c)) {
        if(a < c) {
          System.out.println(" b < a < c") ;
        }else {
         System.out.println("b < c < a");
        }

    } else {

if(a < b){
    System.out.println("c < a < b");
    
}else{
    System.out.println("c < b < a ");
}

    }
        
    }

}
