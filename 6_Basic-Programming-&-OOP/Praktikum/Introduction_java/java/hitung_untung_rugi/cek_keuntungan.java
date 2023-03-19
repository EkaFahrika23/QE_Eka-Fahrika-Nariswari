package hitung_untung_rugi;
import java.util.Scanner;
public class cek_keuntungan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga jual : ");
        double hargajual = input.nextDouble();

        System.out.print("Masukkan harga beli : ");
        double hargabeli = input.nextDouble();

        if (hargajual > hargabeli){
            double keuntungan = hargajual - hargabeli;
            System.out.println("Anda mendapatkan keuntungan sebesar : " + keuntungan);

        } else if (hargabeli == hargajual) {
            System.out.println("Anda tidak mendapatkan keuntungan maupun kerugian");

        } else {
            double kerugian = hargabeli - hargajual;
            System.out.println("Anda mendapatkan kerugian sebesar : " + kerugian);

        }

    }

}
