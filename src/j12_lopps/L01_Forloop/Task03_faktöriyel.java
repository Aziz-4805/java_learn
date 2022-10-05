package j12_lopps.L01_Forloop;

import java.util.Scanner;

public class Task03_faktöriyel {
    public static void main(String[] args) {

     /*
Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
sayi!= 1*2*3* ...*sayi
  */

        Scanner sc = new Scanner(System.in);
        System.out.println("pozitif bir tamsayı giriniz...");
        int sayı = sc.nextInt();

        System.out.println(faktoriyel(sayı));//int parametreli method call


    }// main sonu


    private static int faktoriyel(int sayı) {
        int  faktoriyel = 1;

        for (int  i = 1; i <= sayı; i++) {
            faktoriyel *= i;

        }
        // System.out.println("faktoriyel : "+faktoriyel);
        return faktoriyel;
    }


}





