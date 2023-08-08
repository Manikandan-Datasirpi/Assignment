abstract class A
{
    abstract void Mobile();

    A()
    {
        System.out.println("Default Constructor");
    }
    public static void greet()
    {
        System.out.println("Hello");
    }
    public void greeting(){
        System.out.println("Welcome to Datasirpi.");
    }
}
class B extends A {

    @Override
    void Mobile() {
        System.out.println("Nokia");
    }
}
class C extends  B
{
    @Override
    void Mobile() {
        System.out.println("Samsung");
    }
}
public class Abst {
    public static void main(String[] args) {
        A objC=new C();
        objC.Mobile();
        objC.greeting();
        objC.greet();
    }
}
