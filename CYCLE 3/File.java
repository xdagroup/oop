import java.io.FileWriter;
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.*;
public class File
{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data:");
        String str = s.nextLine();
        FileWriter fw = new FileWriter("File.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Success!!!");
        fw.close();
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("File.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found!!");
        }
        System.out.println("-----Entered data is given below-----");
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();
        System.out.println("\n");
    }  
}