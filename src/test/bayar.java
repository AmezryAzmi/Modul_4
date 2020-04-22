
package test;
import java.util.Scanner;
public class bayar {
    Scanner input = new Scanner(System.in);
    static void mobil(String merk,String nama,int harga){
        System.out.println("Mobil : " + merk +" " +nama);
        System.out.println("Harga : " + harga +" Dollar");
    }
    public static void BMW (){
        mobil("BMW", "m3 (1)", 7000);
        mobil("BMW", "x5 (2)", 7300);
        mobil("BMW", "Z4 (3)", 8000);
        mobil("BMW", "I8 (4)", 7000);
}
    static void Audi (){
        mobil("Audi", "A4 (1)", 6500);
        mobil("Audi", "RS5 (2)", 6800);
        mobil("Audi", "Q8 (3)", 7000);
        mobil("Audi", "R8 (4)", 9000);
}    
    static void  Porsche (){
        mobil("Porsche", "Cayanne (1)", 6500);
        mobil("Porsche", "Panamera (2)", 6000);
        mobil("Porsche", "Boxster (3)", 7000);
        mobil("Porsche", "911 (4)", 9000);
}
    static void Honda (){
        mobil("Honda", "CRV (1)", 5000);
        mobil("Honda", "Accord (2)", 5500);
        mobil("Honda", "civic type R (3)", 6000);
        mobil("Honda", "jazz (4)", 4000);
}
}