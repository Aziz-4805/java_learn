package Calismalarim;

public class C03_soruCzm {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String s1 = "xyaz";
        boolean xyzIceriyorMu = false;
        if(s1.contains("xyz")){
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);
        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }
    }
}
