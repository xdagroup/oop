import java.io.*;
public class File {

  public static void main(String[] args) {
    
    try {
      FileReader hk=new FileReader("/home/hashir/JAVA/LAB/CYCLE 3/2/file.txt");
      
      
      FileWriter outfile=new FileWriter("/home/hashir/JAVA/LAB/CYCLE 3/2/out.txt");
      int b;
      
          while((b=hk.read())!=-1) {
            outfile.write(b);
          }
      hk.close();
      outfile.close();
    
    } catch (Exception e) {
      
      System.out.println(e.getMessage());
    }
    

  }

}