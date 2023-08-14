import java.io.FileOutputStream;
import java.io.OutputStream;
public class Outputstream
{
    public static void main(String args[])
    {
        String word="Hello Guys, Welcome to Datasirpi";
        try{
        OutputStream out=new FileOutputStream("input.txt");
        byte[] arrray=word.getBytes();
        out.write(arrray);
        System.out.println("Data written in the file");
        out.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}