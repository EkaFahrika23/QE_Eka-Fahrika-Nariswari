package bintang_segitiga;

public class bintang_segitigasamasisi {
        public static void printAsterisk(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            printAsterisk(5);
        }
    }

