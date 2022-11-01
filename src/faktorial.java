import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
               int angka;
               int faktorial=1;
        System.out.println("masukan input : ");
        angka = inputdata.nextInt();
        for (int i = 1; i<=angka;i++){
            faktorial =faktorial*i;
            System.out.println("Hasilnya :"+faktorial);
        }
    }

}
