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
class C extends B
{
    void Disp_C()
    {
        System.out.println("Class C");
    }
}
public class Multi_lvl_Inheritence {
    public static void main(String[] args) {
        C obj=new C();
        obj.Disp_A();
        obj.Disp_B();
        obj.Disp_C();
    }
}
