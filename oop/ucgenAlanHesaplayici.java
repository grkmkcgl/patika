package Giris;
import java.util.Scanner;

public class ucgenAlanHesaplayici {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3, cevre;
        double alan;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenar uzunluğunu giriniz:");
        kenar1 = input.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Son kenar uzunluğunu giriniz:");
        kenar3 = input.nextInt();

        cevre = (kenar1 + kenar2 + kenar3)/2;
        alan = cevre * (cevre - kenar1)*(cevre - kenar2)*(cevre - kenar3);
        alan = Math.sqrt(alan);
        System.out.print("Üçgenin alanı = " + alan);
    }
}