package Giris;
import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        int mat, turk, fizik, kimya, tarih;
        double dersSayisi = 5.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        turk = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        if(mat > 100 || mat < 0) {
            mat = 0;
            dersSayisi -= 1;
        }
        if(turk > 100 || turk < 0) {
            turk = 0;
            dersSayisi -= 1;
        }
        if(fizik > 100 || fizik < 0) {
            fizik = 0;
            dersSayisi -= 1;
        }
        if(kimya > 100 || kimya < 0) {
            kimya = 0;
            dersSayisi -= 1;
        }
        if(tarih > 100 || tarih < 0) {
            tarih = 0;
            dersSayisi -= 1;
        }

        double average = (mat + turk + fizik + kimya + tarih)/dersSayisi;
        System.out.println("Ortalamaniz: " + average);
        if(average > 55) System.out.println("Gectiniz");
        else System.out.println("Kaldiniz.");


    }
}