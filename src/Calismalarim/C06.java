package Calismalarim;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        String str = "java bilen sırtı yere gelmez :)";
        System.out.println(str.substring(7));// 7. indexten itibaren yazdı.
        System.out.println(str.substring(str.length() - 14));// str de son 14 parçasını buldu bize.
        System.out.println(str.substring(0, 10));// ilk karekterinden itibaren bulmak için de 0,10 yazarız ve ilk 10
        //karakterini bulur,
        System.out.println(str.substring(0, 1));//sıfırıncı charekteri bulur, 0ı alır 1 i almaz,ilki dahil sonu hariçtir.

        //girilen 4 harfli kelimeyi tersten print eden code reate ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("dört hsrfli kelime giriniz: ");
        String kelime = sc.next();
        if (kelime.length() != 4) {
            System.out.println("agam sana 4 harf gir demedik mi ? :)");
        } else {
            System.out.print(kelime.substring(kelime.length() - 1));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1, 2));
            System.out.print(kelime.substring(0, 1));

        }
    }
}














