public class array {
    public static void main(String[] args) {
        //Deklarasi array
        int[]angka= new int[3]; //Indexs dari angka 0-2
        String[]nama= new String [4];//Index dari angka 0-3

        //memasukan  VALUE ke dalam  ARRAY ANGKA
        angka[0]=2;
        angka[2]=4;

        //mengambil value dari array angka
        int s =angka[2];

        //memasukan value ke dalam array String nama
        nama[2]="Deny";
        nama[3]="Budi";

        //mengambil value dari array String nama
        String u =nama[2];
        String t =nama[3];

        //deklarasi array yang lain
        int []number = {1,45,67,89,90,76};
        for (int i=0; i<number.length; i++) {
            System.out.println("Angka dalam Array " + number[i]);
        }

    }
}
