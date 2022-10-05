package J04_AritmeticOperators;

public class C04_MathMethods {
    public static void main(String[] args) {
        System.out.println("81'in karekök değeri : " + Math.sqrt(80*125));//
        System.out.println("sayinin mutlak degeri :"+Math.abs(-3584));//34
        System.out.println(Math.max(150,578));//2 sayidan buyugunu  sec
        System.out.println(Math.min(150,578));//2 sayidan kucugunu sec
        System.out.println(Math.round(12.8));// girilen degere en yakin sayiya yuvarlar.
        System.out.println(Math.pow(2,3));// girilen degere uslu sayi olarak sonuc veridirir.
        System.out.println(Math.floor(3.7));//girilen degere bir önceki en yakin tamsayiya indirger
        System.out.println(Math.ceil(8.7));//girilen degere bir sonraki en yakin tamsayiya yükseltir

    }
}
