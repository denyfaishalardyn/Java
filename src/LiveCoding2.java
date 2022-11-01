import java.util.Scanner;

public class LiveCoding2 {
    public static void main(String[] args) {
        Scanner deny = new Scanner(System.in);
        int inputdata1;
        int inputdata2;
        int Hasil;

        System.out.println("Masukan Nilai x : ");
        inputdata1 = deny.nextInt();
        System.out.println("Masukan Nilai Y : ");
        inputdata2= deny.nextInt();
        for (int N = inputdata1; N <= inputdata2; N++) {
            if ((N % inputdata1 == 0) || (N % inputdata2 == 0)) {
                System.out.println("Angka :" + N);
            } else {
                System.out.println("Tidak ada angka kelipatan 3 dan 7");
                //buatlah program dalam bahasa java untuk mendaftarkan /input 6 nama siswa kemudian disimoan kedalam
                //array kemudian masing masing nama dalam array diperiksa apakah mengandung huruf a atau i
                // masukan - input nama sebanyak 6 nama siswa
                //format - apakah nama mengandung a atau i - misal aldi mengandung a atau 1
                //keluaran
            }
        }
    }
}