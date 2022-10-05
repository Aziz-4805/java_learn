package J10_String_Manipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*concat()methodu içine(parametre) aldığı string variable'i çalıştığı stringin sonuna ekler..
        java'da işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */
        String name ="Nur";

        String meslek =" Qa tester";
        System.out.println(name.concat(meslek));// nur Qa tester
        System.out.println(name);// Nur
        // ahan da TRİKK-->String  methodları variable geçici değişiklik yapar
        // ama atama yapılırsa kalıcı değişir.
        name = meslek.concat(name);
        System.out.println("name  = "+name);// name = Qa tester Nur
        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder
















            }
}
