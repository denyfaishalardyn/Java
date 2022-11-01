public class LatMethod {

    public static void Penjumlahan(){
        int angka1=2;
        int angka2=3;
        int hasil=angka1+angka2;

    }
    public static void cetaksemuamember(String[]anggota){
        for (int i=0; i<anggota.length; i++){
            System.out.println(anggota[i]);
        }
    }

    public static void Perkalian(){
        int angka1=2;
        int angka2=3;
        int hasil=angka1+angka2;
    }

    public static void CetakHeader(String Header){
        System.out.println(Header);
        System.out.println("======================");

    }

    public static void CetakFooter(String Footer){
        System.out.println(Footer);

    }

    public static void ganjilgenap(int number1 ,int number2 ){
        int AfterCalculate =number1*number2;
        if ( AfterCalculate% 2==0 ){
            System.out.println("hasilnya Genap");
        }else{
            System.out.println("hasilnya ganjil");

        }

    }

    public static void main(String[] args) {
      //  Penjumlahan();
        //Perkalian();
        //CetakHeader("Start");
        //ganjilgenap(9,6);
        //CetakFooter("selesai");

        String[] member = new String[3];
        member[0] = "deny";
        member[1]   ="akbar";
        member[2]="surya";
        cetaksemuamember(member);


    }
}
