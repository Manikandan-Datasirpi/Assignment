package Polymorphysim;

public class Method_Overloading {
    public float Area(float a)
    {
        return a*a;
    }
    public float Area(float a,float b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Method_Overloading obj=new Method_Overloading();
        float sqr=obj.Area(10.5f);
        float rect=obj.Area(10, 5.5f);
        System.out.println("Area of square: "+sqr);
        System.out.println("Area of Rectangle:"+rect);
    }
}
