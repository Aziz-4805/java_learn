package J10_String_Manipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt () methodu parametre int olarak girilen index deki char değerini return eder.index değeri sıfırdan başlar.

         */

    String sehir="ıstanbul";
    char besinciİndexKrkt=sehir.charAt(5);
        System.out.println(besinciİndexKrkt);//b
        //son index karakteri---> length()-1
        System.out.println(sehir.charAt(sehir.length()-1));// l harfi
        //ilk index karakter-->charAt(0)

        System.out.println(sehir.charAt(0));// I harfi

       // System.out.println(sehir.charAt(18));// rte(Run time error)

//TRICK-> charAt() index boyutunu geçerse rte verir

        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...
        Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();







    }
}
