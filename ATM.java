
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String userName,password;
        try (Scanner inp = new Scanner(System.in)) {
            int right=3;
            int select;
            int balance=1500;



            while(right>0){
            System.out.print("Kullanıcı Adınız :");
            userName=inp.nextLine();
            System.out.print("Parolanız : ");
            password=inp.nextLine();
            if (userName.equals("Patika")&& password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n"+ "2-Para Çekme\n"+ "3-Bakiye Sorgula\n"+ "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak isteğiniz işlemi seçiniz.");
                    select=inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı:");
                            int price=inp.nextInt();
                            balance +=price;
                        break;
                        case 2:
                            System.out.print("Para miktarı:");
                            int pric=inp.nextInt();
                              if (pric>balance){
                                System.out.println("Bakiye yetersiz.");
                               }else {
                                balance -= pric;
                               }
                        break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                        break;
                    }
                }while (select !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println( "Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                }else{
                    System.out.println("Kalan Hakkınız:"+right);
                }
            }


            }
        }
    }
}