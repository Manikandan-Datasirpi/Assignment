package Polymorphysim;
class a{
    String name="Manikandan";
   public void Disp()
    {
        System.out.println("Hi This is "+name);
    }
       public static void Disp1()
    {
        System.out.println("Hi This is Manikandan");
    }
}
class b extends a
{
    //Variable Shadowing
    String name="Muthu";
    //Method Overriding
   public void Disp()
    {
        System.out.println("Hi This is "+name);
    }
    //Method Shadowing
    public  static  void Disp1()
    {
        System.out.println("Hi This is Muthu");
    }
} 
public class Method_Overriding {
    public static void main(String[] args) {
        a obja= new a();
        obja.Disp();
        a.Disp1();
        b objb=new b();
        objb.Disp();
        b.Disp1();
    }
}
