package luas;

public class bangun_datar {
    public static void main(String[]args){
        //segitiga
        float alas = 20;
        float tinggi = 25;

        double luassegitiga = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga adalah : " + luassegitiga);

        //persegi panjang
        float panjang = 40;
        float lebar = 6;

        double luaspersegipanjang = panjang * lebar;

        System.out.println("Luas persegi panjang adalah : " + luaspersegipanjang);

        //lingkaran
        double jarijari = 7;
        double phi = 3.14;

        double luaslingkaran = phi * jarijari * jarijari;

        System.out.println("Luas Lingkaran adalah : " + luaslingkaran);

    }
}
