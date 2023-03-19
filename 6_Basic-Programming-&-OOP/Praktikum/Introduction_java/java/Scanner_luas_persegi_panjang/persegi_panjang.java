package Scanner_luas_persegi_panjang;
import java.util.Scanner;
public class persegi_panjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}

