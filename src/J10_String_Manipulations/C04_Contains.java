package J10_String_Manipulations;

public class C04_Contains {
    public static void main(String[] args) {

/*
string içerisinde istenen stringin varlığını kontrol eder, boolean return eder.
 */

String s1="abdülaziz Bey başarılı bir QA tester team lead";
        System.out.println(s1.contains("bey"));// false verir çünkü Bey yazılmış B büyük,
        System.out.println(s1.contains("A"));// True verir
        System.out.println(s1.contains(" "));// true verir, boşluk var çünkü.

        String s2="Qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false
// task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız

















    }
}
