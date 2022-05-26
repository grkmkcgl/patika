package Giris;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int month, day;
        String burc;
        Scanner input = new Scanner(System.in);

        System.out.println("Dogdunuz gunu giriniz: ");
        day = input.nextInt();
        System.out.println("Dogdugunuz ayi giriniz: ");
        month = input.nextInt();

        if ((day < 1 || day > 31) || (month < 1 || month > 12)) {
            System.out.println("Yanlis giris yaptiniz.");
        } else {
            if (month == 1) {
                if (day > 21) {
                    burc = "kova";
                } else {
                    burc = "oglak";
                }
            } else if (month == 2) {
                if (day > 19) {
                    burc = "balik";
                } else {
                    burc = "kova";
                }
            } else if (month == 3) {
                if (day > 20) {
                    burc = "koc";
                } else {
                    burc = "balik";
                }
            } else if (month == 4) {
                if (day > 20) {
                    burc = "boga";
                } else {
                    burc = "koc";
                }
            } else if (month == 5) {
                if (day > 21) {
                    burc = "ikizler";
                } else {
                    burc = "boga";
                }
            } else if (month == 6) {
                if (day > 22) {
                    burc = "yengec";
                } else {
                    burc = "ikizler";
                }
            } else if (month == 7) {
                if (day > 22) {
                    burc = "aslan";
                } else {
                    burc = "yengec";
                }
            } else if (month == 8) {
                if (day > 22) {
                    burc = "basak";
                } else {
                    burc = "aslan";
                }
            } else if (month == 9) {
                if (day > 22) {
                    burc = "terazi";
                } else {
                    burc = "basak";
                }
            } else if (month == 10) {
                if (day > 22) {
                    burc = "akrep";
                } else {
                    burc = "terazi";
                }
            } else if (month == 11) {
                if (day > 21) {
                    burc = "yay";
                } else {
                    burc = "akrep";
                }
            } else {
                if (day > 21) {
                    burc = "oglak";
                } else {
                    burc = "yay";
                }
            }
            System.out.println("Burcunuz: " + burc);
        }
    }
}