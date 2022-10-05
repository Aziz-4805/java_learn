package J09_Swictch_Statement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
    //TASK->Girilen haftanın gününü haftaiçi veya haftasonu olduğunu print eden code create ediniz...
        Scanner sc= new Scanner(System.in) ;
        System.out.print("gün giriniz : ");
        String gun = sc.next().toLowerCase();//pazAR girilse bile girilen karakterler küçük harfle atanir.
        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma"://yukarıdaki tüm caseler
                System.out.println("girilen gün haftaiçine aittir...");
              break;

            case "cumartesi":
            case "pazar":
                System.out.println("girilen gün haftasonuna aittir...");
             break;
            default:// switch hiçbir case  eşleşmezse calisir
                System.out.println("lütfen dogru giris yapınız (");







        }










    }
}
