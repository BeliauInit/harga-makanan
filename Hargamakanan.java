package Harga_makanan;

import java.util.Scanner;

public class Hargamakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Pilih menu makanan \n >----------< \n1>ayam \n2>soto \n3>nasi goreng \n4>sate \n5>rawon");

        System.out.print("=");
        int Makanan = input.nextInt();



        //proses
        if (Makanan == 1) System.out.println("Harga Ayam 10k");
        else if (Makanan ==2) System.out.println("Harga Soto 12k");
        else if (Makanan ==3) System.out.println("Harga Nasi Goreng 15k");
        else if (Makanan ==4) System.out.println("Harga Sate 17k");
        else if (Makanan ==5) System.out.println("Harga Rawon 20k");

        else System.out.println("Tidak ada di menu!");






    }
}
