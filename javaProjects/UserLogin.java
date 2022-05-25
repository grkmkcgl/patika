package Giris;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adiniz: ");
        userName = input.nextLine();

        System.out.println("Sifreniz: ");
        password = input.nextLine();

        if(userName.equals("admin") && password.equals("adminpass")) {
            System.out.println("Basariyla giris yaptiniz.");
        } else if(!userName.equals("admin")) {
            System.out.println("Kullanici adiniz yanlis, lutfen tekrar deneyiniz.");
        } else if(!password.equals("adminpass")) {
            System.out.println("Sifrenizi yanlis girdiniz, sifirlamak istiyor musunuz? Evet icin Y hayir icin N yazin.");
            answer = input.nextLine();
            if(answer.equals("Y")) {
                System.out.println("Yeni sifrenizi giriniz: ");
                answer = input.nextLine();
                if(answer.equals(password)) {
                    System.out.println("Yeni sifreniz eskisi ile ayni olamaz.");
                } else {
                    password = answer;
                    System.out.println("Yeni sifreniz basariyla olusturuldu.");
                }
            } else{
                System.out.println("Exit.");
            }
        }
    }
}