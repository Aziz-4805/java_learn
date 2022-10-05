package Calismalarim;

import java.util.Scanner;

public class C01_soruCzm {
    public static void main(String[] args) {

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        str1=str1.replaceAll("\\D","");
        System.out.println(str1);//1399
        String str2 = "$10.55";
        str2 = str2.replaceAll("\\D","");
        System.out.println(str2);//1055

        System.out.println(str1+str2);//13991055
        // str1 ve str2 icerigi sayi olan String ifadelerdir
         // Eger iceriginin tamamen sayi oldugunu bildigimiz
        // String varsa parseDouble() veya parseInteger() methodu kullanbiliriz
        // kelımeyı sayıya donustur methodu.

        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        double toplam=(sayi1+sayi2) /100; //virgullu sayı oldugu ıcın boluyoruz.
        System.out.println("$" + toplam);


         // SORU 2:
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gecerli bır kelime giriniz");
        String kelime = scan.next();
        String s=(kelime.substring(kelime.length()-2));
        if (kelime.length()>=3) {
            System.out.println(s+ s+s);
        }else {
            System.out.println(kelime);

        }

         //SORU 3:
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen cumle olusturmak ıcın bır kelıme gırınız : ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        String word4 = scan.next();
        System.out.println(word1.substring(0,1).toUpperCase() + word1.substring(1) + "" + word2 +"" + word3 + "" + word4 + ".");


        //SORU 4:
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/



    }
}
