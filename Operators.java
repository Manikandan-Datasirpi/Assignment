public class Operators {
    public static void main(String args[])
    {
        //Oprators
        //Arithmetic Opertors
        int a=10,b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Sift Opertors
        System.out.println(a<<2);//1010//101000->

        System.out.println(a>>2);

        //Assignment Operators

        a=10;
        int c=a;
        c+=a;
        System.out.println(c);
        c-=a;
        System.out.println(c);
        c*=a;
        System.out.println(c);
        c/=a;
        System.out.println(c);
        c%=a;
        System.out.println(c);

        //Conditional opertors

        a=10;
        b=20;
        if(a<b)
        {
            System.out.println("Hello World!");
        }
        if(a>b)
        {
            System.out.println("Hello World!");
        }
        if(a<=b)
        {
            System.out.println("Hello World!");
        }
        if(a>=b)
        {
            System.out.println("Hello World!");
        }
        if(a==b)
        {
            System.out.println("Hello World!");
        }
        if(a!=b)
        {
            System.out.println("Hello World!");
        }
        // Bitwise Operators

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        // Logical Operators

        if((a<b)&&(a<c))
        {
            System.out.println("Hello World!");
        }
        if((a<b)||(a<c))
        {
            System.out.println("Hello World!");
        }
        //Unary Operators

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        //Ternary Operators

        String res=a<b?"B Greater the A": "A is Greater the B";
        System.out.println(res);

    }
}
