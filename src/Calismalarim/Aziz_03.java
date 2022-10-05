package Calismalarim;

public class Aziz_03 {
    public static void main(String[] args) {
     String diller =" ingilizce, fransızca, ispanyolca, türkce"  ;
        System.out.println(diller.contains("arapca")); // contains, ifadenin içerip içermediğini kontrol eder.
        System.out.println(diller.trim());//karekterleri temizler mesela boşlukları düzeltmek için vs.
        System.out.println(diller.charAt(5));//indexteki karekter sırasından bulur ve getirin
        System.out.println(diller.replace("ispanyolca", "arapca"));;//string içinde ifade değişikliği yapar,
        //mesela ispanyolcayı sildik yerine arapca yı ekledik.

        String bilgi ="ben Javayı sevmiyorum!";
        System.out.println(bilgi.replace("sevmiyorum", "cok seviyorum"));//string içinde ifade değişikliği yapar,
        //mesela sevmiyorum sildik yerine cok seviyorum u ekledik.

        String isim1 = "a harfi";
        String isim2 = "f harfi";
        System.out.println(isim1.compareTo(isim2));//elde edilen sonuc - ise yazılan 2. ifade alfabede daha sonra geliyor,
        //eğer +(pozitif) sonuç çıkarsa 2.yazılan ifade daha önce geliyor.








    }
}
