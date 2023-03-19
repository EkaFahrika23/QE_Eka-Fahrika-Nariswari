package Scanner_luas_lingkaran;
import java.util.Scanner;
public class luas_lingkaran {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran : ");
        double jarijari = input.nextDouble();

        double phi = 3.14;
        double luas = phi * jarijari * jarijari;

        System.out.println("Luas lingkaran adalah : " + luas);
    }
}
