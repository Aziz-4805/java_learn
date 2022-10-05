package J04_AritmeticOperators;


import java.util.Scanner;

public class Calısmam {
    public static void main(String[] args) {
        //int a = 13;
        //int b = 17;
        //int c = 47;
        //System.out.println(b + a * c);
        //System.out.println(c - a / (b - c) + a * b);
        //int g = 2;
        //int h = 3;
        //String s = "JavaCAN";//-> g h s variable'ları kullanarak 61JavaCAN-1 print eden code create ediniz.
        //System.out.println("" + (g * h) + (h - g) + s + (g - h));//61JavaCAN-1

        int g = 2;
        int h = 3;
        String s = "JavaCAN";// g  h  ve s variableları kullanarak 61JavaCAN-1 print eden code create ediniz.
        System.out.println("" + (g * h) + (h - g) + s + (g - h));





        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");

        int sayi = scan.nextInt();

        // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

        System.out.println("Girdiginiz sayinin birler basamagi :" + birler + "\nGirdiginiz sayinin onlar basamagi : " + onlar
                + "\nGirdiginiz sayinin yuzler basamagi :" + yüzler);
    }
}

