package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();


        int lastDigit = number%10;
        number = number/10;


        int secondLastDigit = number%10;
        number = number/100;


        int secondDigit = number%10;
        number = number/10;

        int FirstDigit = number%10;


        System.out.println(lastDigit+secondLastDigit+secondDigit+FirstDigit);

    }

}
