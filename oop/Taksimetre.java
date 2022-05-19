package Giris;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double gidilenKm, kmUcreti = 2.2, odenecekUcret;
        int minimumUcret = 20, acilisUcreti = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gidildiğini giriniz:");
        gidilenKm = input.nextDouble();

        odenecekUcret = acilisUcreti + gidilenKm * kmUcreti;
        odenecekUcret = (odenecekUcret >=20) ? (odenecekUcret) : (minimumUcret);
        System.out.print("Ödeyeceğiniz ücret: " + odenecekUcret);

    }
}