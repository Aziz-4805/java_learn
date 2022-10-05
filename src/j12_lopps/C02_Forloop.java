package j12_lopps;

import java.util.Scanner;

public class C02_Forloop {
    public static void main(String[] args) {

        // task -> girilen sayıdan 100 e kadar +un katı tamsayıları print eden code create ediniz

        Scanner sc= new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayı=sc.nextInt();

        if (sayı>100){
            System.out.println("agam hani 100 den kuçuk girecktin :( ");
        }else {
            for (int i = sayı; i <100 ; i++) {//100 değeri forU çaşıştırmaz 98 foru çalıştırı ama for içindeki if çalışmaz
                if (i%4==0){
                    System.out.print(i+" ");
                }
                // System.out.println("selam");
            }
        }

    }
}
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
              - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
              - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
              - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

*/




