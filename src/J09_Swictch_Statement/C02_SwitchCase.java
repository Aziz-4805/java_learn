package J09_Swictch_Statement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {

        //TASK-> Kullanıcının girdiği yılın ay sırasına göre ayın ismin print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir ay  gir bakam : ");
        int ayNo = sc.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("haziran");
                break;
            case 6:
                System.out.println("temmuz");
                break;
            case 7:
                System.out.println("agustos");
                break;
            case 8:
                System.out.println("eylul");
                break;
            case 9:
                System.out.println("ekim");
                break;
            case 10:
                System.out.println("kasım");
                break;
            case 11:
                System.out.println("aralık");
                break;
            case 12:

            default:
                System.out.println("agam sizin köyde bir yılda kaç ay var :( ");


        }


    }


}
