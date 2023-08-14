import java.io.FileInputStream;
import java.io.InputStream;
public class FileInput {
    public static void main(String[] args) {
        try
        {
            InputStream in=new FileInputStream("input.txt");
            int i=in.read();
            System.out.println("Data in the given file:");
            while(i!=-1)
            {
                System.out.print((char)i);
                i=in.read();
            }
            in.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
