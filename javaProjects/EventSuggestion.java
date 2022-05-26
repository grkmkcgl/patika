package Giris;
import java.util.Scanner;

public class EventSuggestion {
    public static void main(String[] args) {
        int temperature;

        System.out.println("Hava sicakligini giriniz.");

        Scanner input = new Scanner(System.in);
        temperature = input.nextInt();

        if(temperature < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }else if(temperature >= 5 && temperature <= 25) {
            if(temperature <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(temperature >= 10) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}