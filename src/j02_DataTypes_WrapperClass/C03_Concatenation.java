package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad="haluk";
        String soyadı="bilgin";

        int a=7;
        int b=11;
        // birden çok string ile farklı data type variable'ler + ile işlem alınırsa
        //java birleştirme yaparak yeni bir string oluşturur

       // System.out.println(ad+ssoyad+a+b);//
       // System.out.println(a+ad+ssoyad+a+b);//
        //System.out.println(a+b+ad+ssoyad);//
        //System.out.println(" "+a+b);//

       // System.out.println(ad+ssoyad+(a+b));//

       // System.out.println((a+b)+ad+ssoyad);//

       // System.out.println(ad+(a-b)+(a-b));//


        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */
// TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
// işlem yapılıp String variable'a Concatenation yapılır.






    }
}
