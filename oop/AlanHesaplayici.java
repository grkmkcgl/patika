package Giris;
import java.util.Scanner;

public class AlanHesaplayici {
    public static void main(String[] args) {
        int yaricap;
        double pi = 3.14, aci, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenizin yarıçapını giriniz: ");
        yaricap = input.nextInt();
        System.out.print("Merkez açınızın ölçüsünü giriniz: ");
        aci = input.nextDouble();

        alan = (pi * (yaricap*yaricap) *aci)/360;
        System.out.print("Dairenizin alanı: " + alan);
    }
}