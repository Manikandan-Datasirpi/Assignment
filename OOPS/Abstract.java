abstract class  Parent 
{
    abstract void greet();
}
class child extends Parent
{
    void greet()
    {
        System.out.println("Welcome to Datasirpi");
    }
}
class Abstract
{
    public static void main(String args[])
    {
        child ch =new child();
        ch.greet();
    }
}