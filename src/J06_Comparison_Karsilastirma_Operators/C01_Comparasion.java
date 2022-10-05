package J06_Comparison_Karsilastirma_Operators;

public class C01_Comparasion {

    public static void main(String[] args) {
        //         /*

        // ==     Esit               x == y
        // !=     Esit degil         x != y
        // >      buyuk              x > y
        // <      kucuk              x < y
        // >=     buyuk esit         x >= y
        // <=     kücük esit         x <= y

        //  */

        int slmYs = 53;
        int krmYs = 41;
        System.out.println("krm b esit mi slm b-> " + (krmYs == slmYs));//false
        System.out.println("krm b esit degil mi slm b -> " + (krmYs != slmYs));//true
        System.out.println("krm b kucuk mu slm b -> " + (krmYs < slmYs));//false
        System.out.println("krm b buyuk mu  slm b -> " + (krmYs > slmYs));//true

        /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
        s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool
        üzerinde aynı adresi gösterirler.
          Böylece ekrana TRUE yazdırır.
        */
        String s1 = "Kerem bey";
        String s2 = "kerem bey";
        System.out.println(s1 == s2);//FALSE //Java büyük küçük harf duyarlılığı var, true ve false ona göre sonuç verir



    }
}
