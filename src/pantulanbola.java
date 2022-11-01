import java.util.Scanner;

public class pantulanbola {
    public static void main(String[] args) {
        System.out.println("==============================");
        //input
        String Username;
        Scanner dayik = new Scanner (System.in);
        System.out.print("UserName : ");
        Username = dayik.nextLine();

        //tipe data & var
        double R ; //Coef
        double s1; //S naik
        double s2; //S turun
        double s3; //S total
        double T; //Tinggi Mula-Mula

        //input
        System.out.print("Masukan Tinggi Mula-Mula T : ");
        T = dayik.nextDouble();
        System.out.print("Masukan Coef R : ");
        R = dayik.nextDouble();

        //RUMUS

        s1 = T /(1-R);
        s2 = s1*R;
        s3 = s1+s2;

        //menampilkan dari rumus
        System.out.println("Jarak Lintasan Naik Adalah = "+ s1);
        System.out.println("Jarak Lintasan Turun Adalah = "+ s2);
        System.out.println("Total  = "+ s3);

        //mencari bilangan genap atau ganjil
        if (s3%2 == 0 ){
            System.out.println("Bilangan genap");
        }else{
            System.out.println("Bilangan ganjil");
        }

    }
}
