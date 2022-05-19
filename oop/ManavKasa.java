package Giris;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double toplamFiyat = 0.0, kg;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo alındı: ");
        kg = input.nextDouble();
        toplamFiyat += armut * kg;
        System.out.print("Elma kaç kilo alındı: ");
        kg = input.nextDouble();
        toplamFiyat += elma * kg;
        System.out.print("Domates kaç kilo alındı: ");
        kg = input.nextDouble();
        toplamFiyat += domates * kg;
        System.out.print("Muz kaç kilo alındı: ");
        kg = input.nextDouble();
        toplamFiyat += muz * kg;
        System.out.print("Patlıcan kaç kilo alındı: ");
        kg = input.nextDouble();
        toplamFiyat += patlican * kg;
        System.out.print("Toplam tutar: " + toplamFiyat + " TL");
    }
}