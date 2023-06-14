import java.util.Scanner;

public class USER {
   public static void main(String[] args) {

    String userName , password , newPass ;

    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz:" );
        password = input.nextLine();
        
        if(userName.equals("Patika") && password.equals("java123")) {

            System.out.println("Giriş Yaptınız!");

        } else   {
            System.out.println("Bilgileriniz Yanlış! ");
         
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = input.nextLine();
        
        
            switch (cevap) {
            case "evet":        
              System.out.print("Yeni Şifrenizi Giriniz:");
              newPass = input.nextLine(); 
          if (newPass.equals("java123")) {
              System.out.println("Şifreniz Eski Şifrenizle Aynı Olamaz");
        }else {
              System.out.println("Yeni Şifreniz Belirlenmiştir Tekrar Giriş Yapınız");
                break;
               }
                case "hayır":
                System.out.println("Tekrar Deneyiniz.");
                break;
            }
        }
    }
}
}
    

   




