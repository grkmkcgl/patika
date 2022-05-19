package Giris;
import java.util.Scanner;

public class KDVHesaplayici {
    public static void main(String[] args) {
        double kdvUcuzUrun = 18.0/100.0, kdvPahaliUrun = 8.0/100.0, price, newPrice;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen ürünün değerini giriniz : ");
        price = inp.nextDouble();

        newPrice = (price >= 1000.0) ? (price + price* kdvPahaliUrun) : (price + price* kdvUcuzUrun);
        System.out.print("KDV'li fiyat : " + newPrice);
    }
}