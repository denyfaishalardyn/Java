import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ReadStringByChar {
    public static void main(String[] args) {
        try
        {
            Scanner inputData= new Scanner(System.in);
            String directory = System.getProperty("user.dir");
            System.out.println("Current directory : "+directory);
            System.out.println("Type FileName :");
            String Contoh = inputData.nextLine();
            System.out.println("Type directory :");
            String Documents = inputData.nextLine();
            if ((Contoh.isEmpty())||(Documents.isEmpty())){
                System.out.println("Process Cannot continue ...");
                System.exit(0);
            }
                File myFile =new File(Documents+"/"+Contoh);
                if (myFile.exists()){
                    FileReader fr=new FileReader(Documents+"/"+Contoh);
                    System.out.println("File content :");
                    int r=0;
                    while ((r=fr.read())!=-1)
                    {
                        System.out.print((char)r);
                        TimeUnit.MILLISECONDS.sleep(120);

                    }
                }else{
                    System.out.println("File does not exists..");
                    System.exit(0);
                }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
