import java.util.Scanner;

public class programkasir {
    public static void main(String[] args) {
        System.out.println("Masukan Data Berikut :");
        System.out.println("=========================");

        Scanner deny = new Scanner(System.in);
        String NamaBarang;
        int Jumlahbarang;
        int HargaBarang;
        Double Diskon = 0.075 ;
        int Totalharga;
        int TotalBayar;

        System.out.println("Nama Barang ");
        NamaBarang = deny.nextLine();
        System.out.println("JumlahBarang :");
        Jumlahbarang = deny.nextInt();
        System.out.println("Harga Barang :");
        HargaBarang = deny.nextInt();

        Totalharga =Jumlahbarang*HargaBarang;
        Diskon =Totalharga-Diskon;
        System.out.println("Total Bayar "+Diskon);


        System.out.println("===================================");
        System.out.println("Nota Pembelanjaan Barang ");
        System.out.println("Nama Barang "+NamaBarang);
        System.out.println("JumlahBarang "+Jumlahbarang);
        System.out.println("Harga Barang "+HargaBarang);
        System.out.println("Total Bayar "+Diskon);

        }

    }


