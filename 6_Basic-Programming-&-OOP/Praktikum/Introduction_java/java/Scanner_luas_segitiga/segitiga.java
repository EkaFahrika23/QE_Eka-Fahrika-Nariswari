package Scanner_luas_segitiga;

import java.util.Scanner;
public class segitiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitia.segitiga :");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitia.segitiga :");
        double tinggi = input.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitia.segitiga adalah :" + luas);

    }
}
