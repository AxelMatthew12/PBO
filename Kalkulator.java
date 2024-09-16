import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== KALULATOR SEDERHANA ====");
        System.out.println("||     PILIH OPERATOR      ||");
        System.out.println("||       1. TAMBAH         ||");
        System.out.println("||       2. KURANG         ||");
        System.out.println("||       3. PERKALIAN      ||");
        System.out.println("||       4. PEMBAGIAN      ||");
        System.out.println("=============================");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println(" INPUT ANGKA PERTAMA: ");
                int angka1 = sc.nextInt();
                System.out.println("INPUT ANGKA KEDUA: ");
                int angka2 = sc.nextInt();

                int angkatotal = angka1 + angka2;
                System.out.println("HASIL: " + angkatotal);

                break;
            case 2:
                System.out.println(" INPUT ANGKA PERTAMA: ");
                int angka3 = sc.nextInt();
                System.out.println("INPUT ANGKA KEDUA: ");
                int angka4 = sc.nextInt();

                int angkatotal2 = angka3 - angka4;
                System.out.println("HASIL: " + angkatotal2);
                break;
            case 3:
                System.out.println("INPUT ANGKA KETIGA: ");
                int angka5 = sc.nextInt();
                int angka6 = sc.nextInt();

                int totalangka3 = angka5 * angka6;
                System.out.println("HASIL: " + totalangka3);
                break;
            case 4:
                System.out.println(" INPUT ANGKA PERTAMA: ");
                int angka7 = sc.nextInt();
                System.out.println("INPUT ANGKA KEDUA: ");
                int angka8 = sc.nextInt();
                int totalangka4 = angka7 / angka8;
                System.out.println("HASIL: " + totalangka4);
                break;
            default:
                System.out.println("Error opsi silahkan kembali lagi !");
                break;
        }

    }

}
