package Giris;
import java.util.Scanner;

public class NotHesaplayici {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int notToplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = notToplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        double gecernot = 60.0;
        String gecmeDurumu = (sonuc >= gecernot) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(gecmeDurumu);
    }
}