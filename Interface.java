interface inter
{
    void Display();

    public static  void greet()
    {
        System.out.println("Hello from inter class");
    }
}
interface inter2
{
    void Disp();

    public static  void greeting()
    {
        System.out.println("Hi from inter2 class");
    }
}
class  InterChild implements inter,inter2
{
    @Override
    public void Display() {
        System.out.println("From Inter class");
    }

    @Override
    public void Disp() {
        System.out.println("From Inter2 class");
    }
}
public class Interface {
    public static void main(String[] args) {
        InterChild c=new InterChild();
        c.Display();
        c.Disp();
        inter.greet();
        inter2.greeting();
    }
}
