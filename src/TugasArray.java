
import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        String[] Nama = new String[6];
        Scanner deny = new Scanner(System.in);
        for (int d = 0; d < Nama.length; d++) {
            System.out.print("Masukan Nama dari " + d + ":");
            Nama[d] = deny.nextLine();
        }

        System.out.println("=====================================");
        System.out.println("        Data menunjukan              ");
        System.out.println("=====================================");

        for (String d : Nama) {
            System.out.println(d);
            if ((d.contains("a")) || (d.contains("i"))) {
                    System.out.println("Punya Huruf a atau i");
                    System.out.println("=======================");

                } else {
                    System.out.println("Ga ada Pakk!!!");
                    System.out.println("========================");

                }


            }


        }
    }


