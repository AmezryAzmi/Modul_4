
package test;
import java.util.Scanner;
public class TEST {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   bayar model = new bayar();
   System.out.println("Selamat datang di car dealership");
   System.out.println("Silahkan pilih merk mobil");
   System.out.println("(1)BMW         (2)Audi");
   System.out.println("(3)Honda       (4)Porsche");
   System.out.print("Silahkan Pilih : ");
   int i = input.nextInt();
   switch (i){
       case (1):{
           model.BMW();
           System.out.print("Silahkan Pilih : ");
           int pilih = input.nextInt();
           System.out.println("Silahkan pilih warna : ");
           System.out.println("[1]Silver    [2]Hitam    [3]Merah");
           System.out.print("Pilihan : ");
           int warna = input.nextInt();
           bayar.warna(warna);
           Transaksi.BMW(pilih);
       break;
       }
       case (2):{
           model.Audi();
           System.out.print("Silahkan Pilih : ");
           int pilih = input.nextInt();
           System.out.println("Silahkan pilih warna : ");
           System.out.println("[1]Silver    [2]Hitam    [3]Merah");
           System.out.print("Pilihan : ");
           int warna = input.nextInt();
           bayar.warna(warna);
           Transaksi.Audi(pilih);
       break;
       }
       case (3):{
           model.Honda();
           System.out.print("Silahkan Pilih : ");
           int pilih = input.nextInt();
           System.out.println("Silahkan pilih warna : ");
           System.out.println("[1]Silver    [2]Hitam    [3]Merah");
           System.out.print("Pilihan : ");
           int warna = input.nextInt();
           bayar.warna(warna);
           Transaksi.Honda(pilih);
       break;
       }
       case (4):{
           model.Porsche();
           System.out.print("Silahkan Pilih : ");
           int pilih = input.nextInt();
           System.out.println("Silahkan pilih warna : ");
           System.out.println("[1]Silver    [2]Hitam    [3]Merah");
           System.out.print("Pilihan : ");
           int warna = input.nextInt();
           bayar.warna(warna);
           Transaksi.Porsche(pilih);
       break;
       }
   }
}    
}
