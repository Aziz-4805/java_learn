package Calismalarim;

public class C07 {
    public static void main(String[] args) {

        String str = "Good";
        System.out.println("ilk görülen o nun yeri index nosu :" + str.indexOf('o'));//1
        System.out.println("d nin yeri index nosu :" + str.indexOf("d"));//3
        System.out.println("D nin yeri index nosu :" + str.indexOf("D"));//-1
        //task: OLMAYAN KARAKTER İNDEX İ SORGULANIRSA -1 RUN EDER.

        System.out.println("od nin yeri index nosu :" + str.indexOf("od"));// ilk od yi bulup run etti.

        String isim = "mustafa nizamoğlu";
        System.out.println(isim.indexOf('a'));// baştan başladı ve ilk a yı buldu ve yeri 4.indekstir
        System.out.println(isim.lastIndexOf('a') );//sondan başladı ve ilk a yı buldu ve yeri 11. indekstir
        System.out.println(isim.lastIndexOf("fa"));// 5
        System.out.println(isim.indexOf("fa"));//5












    }
}
