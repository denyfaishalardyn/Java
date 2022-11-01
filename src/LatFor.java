import java.util.Scanner;

public class LatFor {
    public class inventory{

        String KodeBarang;
        String NamaBarang;
        int QTY;

    }
    public static void main(String[] args) {
        Scanner deny= new Scanner(System.in);
        String[]belanjaangua= new String[10];

        for (int d=1; d<=belanjaangua.length; d++ ){
            System.out.println("Masukan Nama Barang ");
            belanjaangua[d]=deny.nextLine();
        }
        int j=0;
        do{
            System.out.println("Masukan nama barang ");
            belanjaangua[j]=deny.nextLine();
            j++;
        }while (j < belanjaangua.length);




    }
}
