import java.util.Scanner;

public class CodingIseng {
    public static void main(String[] args) {

        Scanner deny = new Scanner(System.in);
        int Angka1;
        int Angka2;
        int Hasil;
        System.out.println("Masukan Angka 1 :");
        Angka1 = deny.nextInt();
        System.out.println("Masukan Angka2 :");
        Angka2 = deny.nextInt();
        Hasil = Angka1 + Angka2;
        System.out.println("hasilnya Adalah :" + Hasil);


    }
}
