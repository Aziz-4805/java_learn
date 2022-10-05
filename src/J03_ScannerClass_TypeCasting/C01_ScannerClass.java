package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
     //Kullanıcadan veri almak için şu üç adım takip edilir.
     //1.adım: Scanner class dan obje create edilir.
       // Scanner scan = new Scanner(System.in); //Scanner classından scan isminde değerini System içinden alan bir objedir.
        //2. adım: kullanıcıdan istenen veri için bildirimde bulunur yani sount(" . . . .") ;
        //System.out.print("adınızı giriniz :");
        //3. adım kullanıcının girdiği veri data type ne göre bir variable atanır.
        //String isim=scan.nextLine();// kullanıcıdan gelen string tipinde isim verisi scan objesini nextline() methodu ile atandı.
       // System.out.println("isim = " + isim);


        // String isim= scan.nextLine();
        // Task->kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz.
       // Scanner scanner=new Scanner(System.in); //1. adım
       // System.out.print("karenin kenarını giriniz :"); //2.adım
       // int kenar=scanner.nextInt();// 3.adım
        //System.out.println("alan :"+(kenar*kenar) +"çevre:"+(kenar*4) );


/*
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */
        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);





    }
}
