package Package2;
import Package1.Pack1;
public class Pack2 extends  Pack1{
    public static void main(String args[]) {

        System.out.println("Adding two number: "+Pack1.add(10, 20));
        Pack1 obj=new Pack1();
        System.out.println("Sub two number: "+obj.sub(10,5));
        System.out.println(Pack2.mul(10,20));
    }
}
