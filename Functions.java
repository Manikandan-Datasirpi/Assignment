public class Functions {
    String name;
    double AreaofRect(double len,double bre)
    {
        return len*bre;
    }
    double AreaofSqr(double side)
    {
        return side*side;
    }
    void name(Functions f,String n)
    {
        f.name=n;
    }
    static void Display()
    {
        System.out.println("Hello");
    }
    void dis()
    {
        System.out.println("I'm Manikandan");
    }
    public static void main(String args[])
    {
        Functions obj2=new Functions();
        Functions obj=new Functions();
        double a=obj.AreaofRect(10, 20);
        System.out.println("Area of Rectangle: "+a);
        double b=obj.AreaofSqr(20);
        System.out.println("Area of Squear: "+b);

        // Passing object as a parameter
        obj.name(obj2,"Muthu");
        System.out.println(obj2.name);

        //Calling Static function
        Display();

        // Calling default function
        obj.dis();
        
    }
}