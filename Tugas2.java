import java.awt.geom.PathIterator;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Pilihlah bangun datar: ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran\n");

        System.out.print("Masukkan Pilihan bangun datar yang ingin anda pilih: ");
        int choose = input.nextInt();


        switch (choose) {
            case 1:
                countSquare();
                break;
            case 2:
                countRectangle();
                break;
            case 3:
                countCircle();
                break;
            default:
                System.out.print("Maaf Pilihan Anda Tidak Ada! Silahkan Memilih Ulang");
        }
        input.close();

    }

    public static void countSquare() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Persegi: ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("\nLuas Persegi : " + luas);
        System.out.println("Keliling Persegi: " + keliling);

        input.close();

    }

    public static void countRectangle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan Lebar: ");
        double lebar = input.nextDouble();

        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("\nLuas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        input.close();
    }

    public static void countCircle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jari-jari Lingkaran: ");
//        System.out.println("Masukkan Keliling Lingkaran: ");
        double jariJari = input.nextDouble();
//        double keliling = input.nextDouble();

        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("\nLuas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        input.close();
    }

}
