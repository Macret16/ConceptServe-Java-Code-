import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class filehand {
    public static void main(String[] args){
        try {
            FileOutputStream write = new FileOutputStream("newfile.txt");
            write.write("Hello World".getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            FileWriter writer = new FileWriter("newfile2.txt");
            writer.write("Hello World");
            writer.close();
            }catch (Exception e) {
                System.out.println(e);
            }
        
        try {
            FileInputStream obj = new FileInputStream("newfile.txt");
            int i = obj.read();
            while (i != -1) {
                System.out.print((char) i);
                i = obj.read();
            }
            obj.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            FileReader read = new FileReader("newfile2.txt");
            int j = read.read();
            while(j!=-1){
                System.out.print((char)j);
                j = read.read();
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}