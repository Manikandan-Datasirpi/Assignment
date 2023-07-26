public class Objects {

    String name; // Instance Variables
    int id;
    void Getter ()
    {
        System.out.println("User Id:"+id);
        System.out.println(name);
    }
    void Setter(int id,String name)
    {
        this.name=name;
        this.id=id;
    }
    public static void main(String[] args)
    {
        Objects obj1 = new Objects();
        obj1.Setter(10001,"Mani");
        obj1.Getter();

        Objects obj2 = new Objects();
        obj2.Setter(10002,"Muthu");
        obj2.Getter();
    }
}
