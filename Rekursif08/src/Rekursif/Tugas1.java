package Rekursif;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();

        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (n - i) + ": ");
            angka[i] = scanner.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angka, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan (rekursif) adalah: " + totalRekursif);

        int totalIteratif = hitungTotalIteratif(angka, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan (iteratif) adalah: " + totalIteratif);
    }

    public static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0;
        } else {
            return angka[n - 1] + hitungTotalRekursif(angka, n - 1);
        }
    }

    public static int hitungTotalIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        return total;
    }
}