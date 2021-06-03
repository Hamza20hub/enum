import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
        public static void main(String[] args) throws FileNotFoundException {
            try{
                File file= new File("/Users/anharuzzaman/Documents/sample3.txt");
                Scanner scanner = new Scanner(file);
                System.out.println(scanner.nextLine());

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }


