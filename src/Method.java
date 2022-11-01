import java.util.Scanner;

public class Method {
    public static void penjumlahan (int x , int y){
        int jumlah = x + y;
        System.out.print("Hasilnya adalah"
                +jumlah);
    }
    public static void main(String[] args) {
        //penjumlahan(7000 ,6000);
        //Cara simple lebih efisien
        Scanner deny =new Scanner(System.in);
        System.out.println("Masukan angka 1 =" );
        int angka1=deny.nextInt();
        System.out.println("Masukan Angka 2 = ");
        int angka2=deny.nextInt();
        //Proses hasil
        penjumlahan(angka1,angka2);
    }

}




