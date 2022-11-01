import java.util.Scanner;

public class LiveCoding1A {
    public static void main(String[] args) {

    Scanner deny = new Scanner(System.in);
    int Angka1,hasil;

        System.out.println("masukan angka :");
        Angka1 = deny.nextInt();
        hasil = Angka1 * Angka1;
        if (hasil >= 10 && hasil <= 30){
            System.out.println("Maka Hasilnya Adalah "+hasil);


        }
    }
}
