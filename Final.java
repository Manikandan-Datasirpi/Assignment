import com.sun.security.jgss.GSSUtil;

public class Final {
    final String name; // Final variable
    static final int age;
    Final(String name)
    {
        this.name=name; //Declare value using constructor
    }
//    Final(final int salary) // Final Parameter
//    {
//        System.out.println(salary);
//    }
    static {
        age=21; // Declare value using static block
    }
    final void greeting()
    {
        System.out.println("Welcome to Datasirpi");
    }

    public static void main(String[] args) {
        Final obj=new Final("Mani");
//        Final o=new Final(2000);
        obj.greeting();
    }
}
