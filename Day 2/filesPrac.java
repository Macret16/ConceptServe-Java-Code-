import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filesPrac {
    public static void main(String[] args) {
        // Create new file
        File file = new File("newfile.txt");
        try {
            file.createNewFile();
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println("Failed to create file..");
            e.printStackTrace();
        }

        // Write into a file
        String str = "File Handling is Awesome!";
        try {
            FileWriter writer = new FileWriter("newfile.txt");
            writer.write(str);
            writer.close();
            System.out.println("Data Written!");
        } catch (IOException e) {
            System.out.println("Failed to write data..");
            e.printStackTrace();
        }

        // Reading a file
        try {
            Scanner n = new Scanner(file);
            System.out.print("File Content : ");
            while (n.hasNextLine()) {
                String read = n.nextLine();
                System.out.println(read);
            }
            n.close();
        } catch (IOException e) {
            System.out.println("Failed to read data..");
            e.printStackTrace();
        }

        // Deleting file
        // try{
        // if(file.delete()){
        // System.out.println("File deleted.");
        // }
        // } catch (Exception e){
        // System.out.println("Failed to delete file..");
        // e.printStackTrace();
        // }
    }
}