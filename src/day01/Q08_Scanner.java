package day01;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. sayıyı giriniz :" );
        double sayi1= scan.nextDouble();
        System.out.println("lütfen 2. sayiyi giriniz : " );
        double sayi2= scan.nextDouble();
        double toplam =sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
}
