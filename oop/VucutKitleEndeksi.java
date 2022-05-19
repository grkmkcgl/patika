package Giris;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinde giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextDouble();

        double kitleEndeks = kilo/(boy*boy);
        System.out.print("Vücut kitle endeksiniz: " + kitleEndeks);
        String str = (kitleEndeks < 25) ?
                ((kitleEndeks < 18.5) ? ("Düşük kilolusunuz") : ("Normal kilolusunuz"))
                : ((kitleEndeks < 30) ? ("Fazla kilolusunuz") : ("Obezsiniz"));
        System.out.println("\n" + str);
    }
}