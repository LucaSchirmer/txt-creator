import java.io.File;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        // init Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Name of the txt file");

        String fileName = scanner.nextLine();
        scanner.close();

        // File Path to Desktop
        String newTxtFilePath = "C:/Users/LucaS/Desktop/";
        
        File newTxtFile = new File(newTxtFilePath + fileName + ".txt");

        // Create the file physically on the disk
        boolean fileCreated = newTxtFile.createNewFile();

        if (fileCreated) {
            System.out.println("File created successfully: " + newTxtFile.getAbsolutePath());
        } else {
            System.out.println("File already exists or an error occurred while creating the file.");
        }
    }
}
