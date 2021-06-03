import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("/Users/anharuzzaman/Desktop/sample3.txt");
            Scanner scan = new Scanner(file);
            String line = null;
            while ((line = scan.nextLine()) != null) {//Everytime when we
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close();
            System.out.println("How to use it?");
        }
    }
}
