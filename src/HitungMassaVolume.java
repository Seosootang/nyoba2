package Tugas2;

import java.util.Scanner;

/**
 * Kelas untuk menghitung massa jenis, massa, dan volume berdasarkan input pengguna.
 */
public class HitungMassaVolume {

    /**
     * Method utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah yang diberikan saat menjalankan program.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Hitung Massa Jenis");
        System.out.println("2. Hitung Massa");
        System.out.println("3. Hitung Volume");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            hitungMassaJenis();
        } else if (pilihan == 2) {
            hitungMassa();
        } else if (pilihan == 3) {
            hitungVolume();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        input.close();
    }

    /**
     * Method untuk menghitung massa jenis berdasarkan massa dan volume yang dimasukkan pengguna.
     */
    public static void hitungMassaJenis() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan massa (kg): ");
        double massa = input.nextDouble();
        System.out.print("Masukkan volume (m^3): ");
        double volume = input.nextDouble();
        double massaJenis = massa / volume;
        System.out.println("Massa Jenis = " + massaJenis + " kg/m^3");
    }

    /**
     * Method untuk menghitung massa berdasarkan massa jenis dan volume yang dimasukkan pengguna.
     */
    public static void hitungMassa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan massa jenis (kg/m^3): ");
        double massaJenis = input.nextDouble();
        System.out.print("Masukkan volume (m^3): ");
        double volume = input.nextDouble();
        double massa = massaJenis * volume;
        System.out.println("Massa = " + massa + " kg");
    }

    /**
     * Method untuk menghitung volume berdasarkan massa dan massa jenis yang dimasukkan pengguna.
     */
    public static void hitungVolume() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan massa (kg): ");
        double massa = input.nextDouble();
        System.out.print("Masukkan massa jenis (kg/m^3): ");
        double massaJenis = input.nextDouble();
        double volume = massa / massaJenis;
        System.out.println("Volume = " + volume + " m^3");
    }
}
