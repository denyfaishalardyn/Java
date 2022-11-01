public class DataType {
    //primitive data type
    //int , double , long , char , float , byte
    public static void main(String[] args) {
        //menghitung luas dan keliling persegi panjang
        int panjang;
        int lebar;
        int luas;
        int keliling;

        panjang = 10;
        lebar = 25;
        luas = panjang * lebar;
        keliling = 2 * (panjang * lebar);

        System.out.println("Hasil Luas Adalah : " + luas);
        System.out.println("Hasil Keliling Adalah :" + keliling);

        //karakter - char
        char huruf;
        huruf = 'b';
        if (huruf == 'b') {
            System.out.println("Hurufnya adalah " + huruf);
        } else {
            System.out.println("Hurufnya Bukan b ");
        }
    }

    public static class LatMethod {

        public static void Penjumlahan (){
            int angka1=2;
            int angka2=3;
            int hasil=angka1+angka2;

        }
        public static void perkalian(){
            int angka1=2;
            int angka2=3;
            int hasil=angka1*angka2;

        }
        public static void CetakHeader(String Header){
            System.out.println(Header);
            System.out.println("==========================");

        }
        public static void CetakFooter(String Footer){
            System.out.println(Footer);

        }
        public static void GanjilGenap(int number1,int number2){
        int AfterCalculate= number1*number2;
        if (AfterCalculate%2==0){
            System.out.println(AfterCalculate+"Ini adalah genap");
        }else{
            System.out.println(AfterCalculate+"Ini adalah ganjil");

        }

        }
        public static void main(String[] args) {
            //Bisa pakai for untuk perulangan
            //Penjumlahan();
           // perkalian();
            CetakHeader("START");
            GanjilGenap(5,9);
            CetakFooter("SELESAI");

        }
    }
}