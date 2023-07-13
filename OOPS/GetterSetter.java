class Store
{
String name,address;
public String getname()
{
    return name;
}
public String getaddress()
{
    return address;
}
public void setinfo(String name,String address)
{
    this.name=name;
    this.address=address;
}
}
public class GetterSetter {
    public static void main(String args[])
    {
        Store st=new Store();
        System.out.println("Old Value");
        st.setinfo("Manikandan Stores","Palayapettai");
        System.out.println("Store name : "+st.getname());
        System.out.println("Store address : "+st.getaddress());
        Store ch=new Store();
        System.out.println("New Value");
        ch.setinfo("Mani Stores","Palayankottai");
        System.out.println("Store name: "+ch.getname());
        System.out.println("Store address: "+ch.getaddress());
    }
}
