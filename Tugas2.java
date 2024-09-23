import java.awt.geom.PathIterator;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihlah Bangun Datar Dibawah Ini: ");
        System.out.println("\n1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran\n");

        System.out.print("Masukkan pilihan bangun datar yang ingin anda pilih: ");
        int choose = input.nextInt();


        switch (choose) {
            case 1:
                System.out.print("Masukkan Sisi Persegi: ");
                double sisi = input.nextDouble();

                System.out.println("\nLuas Persegi : " + luasPersegi(sisi));
                System.out.println("Keliling Persegi: " + kelilingPersegi(sisi));
                break;

            case 2:
                System.out.print("Masukkan Panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan Lebar: ");
                double lebar = input.nextDouble();

                System.out.println("\nLuas Persegi Panjang: " + luasPersegiPanjang(panjang, lebar));
                System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang(panjang, lebar));
                break;

            case 3:
                System.out.print("Masukkan Jari-jari Lingkaran: ");
                double jariJari = input.nextDouble();

                System.out.println("\nLuas Lingkaran: " + luasLingkaran(jariJari));
                System.out.println("Keliling Lingkaran: " + kelilingLingkaran(jariJari));
                break;

            default:
                System.out.print("Maaf Pilihan Anda Tidak Ada! Silahkan Memilih Ulang Bangun Datar");
        }
        input.close();

    }


    //method untuk luas persegi
    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    //method untuk luas keliling persegi
    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    //method untuk luas persegi panjang
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    //method untuk keliling persegi panjang
    public static double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    //method untuk luas lingkaran
    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    //method untuk keliling lingkaran
    public static double kelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

}
