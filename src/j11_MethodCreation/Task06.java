package j11_MethodCreation;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	 */
        Scanner sc = new Scanner(System.in);
        System.out.println("kare, dikdörtgen,üçgen birini seçiniz : ");
        String secim = sc.next().toLowerCase();
        System.out.println("1. sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int sayi2 = sc.nextInt();

        secim(secim, sayi1, sayi2);
    }

    public static void secim(String str, int sayi1, int sayi2) {
        switch (str) {
            case "kare":
                sayi2 = sayi1;
                kareAlan(sayi1, sayi1);
                kareCevre(sayi2, sayi2);
                break;

            case "dikdörtgen":

                break;

            case "üçgen":


                break;
            default:
                System.out.println("hatalı seçin yaptınız");
                secim(str, sayi1, sayi2);
        }


    }

    private static void kareAlan(int sayi1, int sayi2) {
        System.out.println("kare alan :" + (sayi1 * sayi2));


    }

    private static void kareCevre(int sayi1, int sayi2) {


        System.out.println("kare cevre :" + ((sayi1 + sayi2) * 2));
    }


}





