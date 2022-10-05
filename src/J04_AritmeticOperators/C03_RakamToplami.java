package J04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {
        //kullanicidan alinan 3 basamakli bir sayinin rakamlarini print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi giriniz : ");

       int sayi = scan.nextInt();

        // 1 ler basamgi-> bir sayinin 10 bolumunden kalan 1 ler basmagidir..
        int birler = sayi % 10;//sayinin birler basamagi
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yuzler = sayi / 10;// 85'in 10' a bolumu ->8
        int rakamToplami = birler + onlar + yuzler;
        System.out.println("rakamToplami=" + rakamToplami);



    }
}
