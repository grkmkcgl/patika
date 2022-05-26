package Giris;
import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        int n1,n2,n3;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk degeri giriniz.");
        n1 = input.nextInt();
        System.out.println("Ikinci degeri giriniz.");
        n2 = input.nextInt();
        System.out.println("Ucuncu degeri giriniz.");
        n3 = input.nextInt();

        if(n1 < n2 && n1 < n3) {
            System.out.println(n1 + "en kücük sayidir.");
        } else if(n2 < n3 && n2 < n1) {
            System.out.println(n2 + "en kücük sayidir.");
        } else {
            System.out.println(n3 + "en kücük sayidir.");
        }


    }
}