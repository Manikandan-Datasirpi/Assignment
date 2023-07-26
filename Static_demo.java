public class Static_demo {
    static int count=0;
    int a=0;
    public static void static_increment()
    {
        count++;
    }
    public void non_static_increment()
    {
        a++;
    }
    static
    {
        System.out.println("Hello Guy's");
    }
    public static void main(String[] args)
    {
        Static_demo obj=new Static_demo();

        static_increment();
        obj.non_static_increment();
        System.out.println("Count value:"+count);
        System.out.println("A value:"+obj.a);

        static_increment();
        obj.non_static_increment();
        System.out.println("Count value:"+count);
        System.out.println("A value:"+obj.a);

        count++;
        System.out.println(count);
    }
}
