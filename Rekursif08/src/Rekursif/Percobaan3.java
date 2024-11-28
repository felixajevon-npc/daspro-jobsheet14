package Rekursif;

import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Saldo Awal : ");
        int saldoAwal = sc.nextInt();
        System.out.print("Lamanya Investasi (tahun) : ");
        int tahun = sc.nextInt();

        System.out.println("Jumlah Saldo Setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
