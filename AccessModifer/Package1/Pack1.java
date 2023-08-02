package Package1;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Manikandan
 * @version 1.0
 * @since   2023-08-01
 */
/*
This is a example program for
Access modifier and Comments in    // Multi Line comments
Java.
*/
public class Pack1 {

    public static int add(int a,int b) // static method
    {
        return a+b;
    }
    public int sub(int a,int b) // public
    {
        return a-b;
    }
    private void greeting() //Private
    {
        System.out.println("Welcome to DataSirpi");
    }
    protected static int mul(int a,int b) //Protected
    {
        return a*b;
    }
    int div(int a,int b) //Default
    {
        return a/b;
    }
    public static void main(String[] args) {
        Pack1 obj=new Pack1();
        obj.greeting();
        System.out.println(obj.div(10,5));
    }
}
