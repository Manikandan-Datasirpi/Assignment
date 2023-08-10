import java.io.*;
public class Exp {
    static int[] arr=new int[5];
    public static void  set_value() //Static method
    {
        arr[5]=10;
    }
    public static void Div()
    {
        int a=5/0;
    }
    public static void reading()throws IOException
    {
        FileInputStream input=new FileInputStream("input.txt");
        input.read();
    }
    public static void throw_fun()
    {
        throw  new ArithmeticException("Divided by Zero Exception");
    }
    public static void main(String[] args)
    {
        //try block -Set_value function
        try
        {
            set_value();
        }
        //catch block
        catch (Exception e)
        {
            System.err.println(e);
        }
        finally
        {
            System.out.println("Final Block statement");
        }

        //try block -Div function

        try
        {
            Div();
        }
        catch (ArrayIndexOutOfBoundsException |ArithmeticException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            reading();
        }
        catch (IOException i)
        {
            System.out.println(i.getMessage());
        }
        try
        {
            throw_fun();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
