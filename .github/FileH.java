import java.io.*;
public class FileH {
    public static void main(String[] args) throws IOException{
         File f1 = new File("a.text");
      
        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());

    }
}
