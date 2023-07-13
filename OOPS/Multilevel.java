class ClassA
{
    void PrintA()
    {
        System.out.println("Class A");
    }
}
class ClassB extends ClassA
{
    void PrintB()
    {
        System.out.println("Class B");
    }
}
class ClassC extends ClassB
{
    void PrintC()
    {
        System.out.println("Class C");
    }
}
public class Multilevel 
{
    public static void main(String args[])
    {
        ClassB b=new ClassB();
        b.PrintA();
        ClassC c=new ClassC();
        c.PrintA();
    }    
}
