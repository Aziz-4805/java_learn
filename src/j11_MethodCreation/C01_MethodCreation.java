package j11_MethodCreation;

public class C01_MethodCreation {
        //main method açılış
    /*
    code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tercih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/
        public static void main (String[]args){
            System.out.println("javacanlara selam");
            topla();//parametresiz return type ılmayan void bir method call edildi
            System.out.println("agam bu yazıyı okuduysan ahan da yukarıdaki method call oldu ");
            topla2(34, 43);
            System.out.println("agaya selam");
        }//main method kapanış
        public static void topla () {//parametresiz return type ılmayan void bir method
            int a = 33;
            int b = 23;
            System.out.println(a + b);
            System.out.println("topla methodundan selamlar  :) ");
        }
        public static void topla2 ( int a, int b){//parametreli(2 int) void method
            System.out.println("bu method parametreli");
            System.out.println(a + b);
            System.out.println("topla2  çalıştı");
        }


    }//class kapanış//class kapanış




