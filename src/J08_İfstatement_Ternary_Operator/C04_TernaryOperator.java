package J08_İfstatement_Ternary_Operator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bi tam sayı gir bakam : ");
        int agaSayisi =sc.nextInt();
       // System.out.println( agaSayisi >9 ?" sayı iki ve daha fazla basamaklı " : " sayı tek basamaklı");
        String sonuc = agaSayisi > 9 ? " sayı iki ve daha fazla basamaklı " : "sayı tek basamaklı";
        System.out.println(sonuc);



            }

}
