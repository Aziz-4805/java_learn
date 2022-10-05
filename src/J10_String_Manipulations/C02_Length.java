package J10_String_Manipulations;

public class C02_Length {
    public static void main(String[] args) {

  /*
   length() methodu girilen string in uzunluğunu: içinde bulunan karekter sayısını return eder.
   bütün karakterleri(boşluk vs.) sayıp adedini verir.
   */
       String str="madem geldin dünyaya otu çalış javaya";
       int strKrtSayisi=str.length(); // int type bir data verir.
        System.out.println(str);
        System.out.println(strKrtSayisi); // 38

        String str1="";
        System.out.println(str1.length());// 0 yazar, çift tırnakta hiç boşluk yok, hiçlik demek

        String str2=" ";
        System.out.println(str2.length());// 1 yazar, çift tırnakta 1 boşluk var,

      //  String str3=null;
        //System.out.println(str3.length());//Run time error, tanımlayamadı

        //TRİCK-->Null atanan stringler String method çalışmaz.
        /*
        null case sensitive dir, yani null veya NULL yazılamaz
        null bir değer değildir sadece hiçliği gösteren bir pointer (giriş işaretçi)
         */

String name;// deklare edilmiş ama atanmamış string
      //  name.concat(str1);





    }
}
