package Inheritence;
class A 
{
    void Disp_A()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    void Disp_B()
    {
        System.out.println("Class B");
    }
}
class C extends A
{
    void Disp_C()
    {
        System.out.println("Class C");
    }
}
public class Hierarchal_Inheritence {
    public static void main(String[] args) {
        A objA=new A();
        objA.Disp_A();
        B objB=new B();
        objB.Disp_B();
        C objC=new C();
        objC.Disp_C();

    }    
}
