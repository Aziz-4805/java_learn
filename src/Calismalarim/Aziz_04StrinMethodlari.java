package Calismalarim;

public class Aziz_04StrinMethodlari {
    public static void main(String[] args) {
   String isim = "Abdülaziz "  ;
   String  dil= "Java";
   String bilgi="String uzunluğu elde etme";
        System.out.println(isim);
        System.out.println(dil);
        System.out.println(bilgi);

        int isimUzunluk =isim.length();// isimdeki harfleri ve boşluk varsa saydı
        int dilUzunluk =dil.length();// java harfleri ve boşluk varsa saydı
        int bilgiUzunluk =bilgi.length();//String uzunluğu elde etme harfleri ve boşluk varsa saydı ve konsola yazdı

        System.out.println(isimUzunluk);
        System.out.println(dilUzunluk);
        System.out.println(bilgiUzunluk);


        String ısim ="hamza"; // Isim ve isim2 nin birbirine eşit mi değil mi onu kontrol etti ve true- false verir
        String isim2 ="HAMZA";
        boolean esitMi= ısim.equals(isim2);
        System.out.println(esitMi);

        String bIlgi = "java proglama dili";

        System.out.println(bIlgi.toLowerCase());// Kücük hsrflerle yazdı
        System.out.println(bIlgi.toUpperCase());// Büyük harflerle yazdı

    }

}
