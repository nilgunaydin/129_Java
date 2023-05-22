package day13whileloopdowhileloop;

import java.util.Objects;
import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
            Gecerli Username="admin" ve Password="pwd123" dur.
            Kullanicidan username ve password'u alin.
            Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
            Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
            Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */
        Scanner input = new Scanner(System.in);

        String gecerliPassword="pwd123";
        String gecerliUsername="admin";

        int counter=0;

        do {
            System.out.println("Lutfen kullanici adinizi giriniz");
            String username = input.nextLine();
            System.out.println("Lutfen sifrenizi giriniz");
            String password = input.nextLine();
            if(Objects.equals(username, gecerliUsername) && Objects.equals(password, gecerliPassword)){
                System.out.println( "Hesabiniza hosgeldiniz!");
                break;
            }
            else if(counter<3) System.out.println("kullanici adiniz veya sifreniz yanlis, lutfen tekrar deneyiniz, kalan deneme hakki = " + (3-counter));
            else{
                System.out.println("Hesabiniz bloke olmustur");
            }

            counter++;
        }while(counter<4);



//
//        int counter = 0;
//
//        do {
//            if (counter == 4) {
//                System.out.println("Hesabiniz bloke olmustur!");
//                break;
//            }
//
//            System.out.print("Username'i giriniz : ");
//            String username = input.next();
//
//            System.out.print("Password'u giriniz : ");
//            String password = input.next();
//
//            if (username.equals("admin") && password.equals("pwd123")) {
//                System.out.println("Hesabiniza hosgeldiniz!");
//                break;
//            } else {
//                System.out.println("Username'iniz ya da Password'unuz hatali");
//            }
//            counter++;
//        } while (true);
    }
}
