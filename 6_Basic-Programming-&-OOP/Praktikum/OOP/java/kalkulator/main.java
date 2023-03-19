package kalkulator;

import java.util.Scanner;

public class main {
    public static void main(String[]Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        System.out.println("\nOperasi yang tersedia:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan nomor operasi yang diinginkan: ");
        int operasi = input.nextInt();

        operasi o = new operasi();

        switch (operasi) {
            case 1:
                double hasilPenjumlahan = o.penjumlahan(bilangan1, bilangan2);
                System.out.println(bilangan1 + " + " + bilangan2 + " = " + hasilPenjumlahan);
                break;
            case 2:
                double hasilPengurangan = o.pengurangan(bilangan1, bilangan2);
                System.out.println(bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);
                break;
            case 3:
                double hasilPerkalian = o.perkalian(bilangan1, bilangan2);
                System.out.println(bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);
                break;
            case 4:
                double hasilPembagian = o.pembagian(bilangan1, bilangan2);
                System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
                break;
            default:
                System.out.println("Operasi yang dimasukkan tidak valid.");
                break;
        }

        input.close();
    }
}

