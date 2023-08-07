package Inheritence;
//Single Inheritence
class Parent
{
    String Car;
    Double Accont_bal;
    public void set_car(String car_name)
    {
        this.Car=car_name;
    }
    public String get_car()
    {
        return Car;
    }
    public void set_acct_bal(Double amt)
    {
        this.Accont_bal=amt;
    }
    public Double get_acct_bal()
    {
        return Accont_bal;
    }
}
class Single_Inheritence extends Parent
{
    public static void main(String[] args) {
        Single_Inheritence obj=new Single_Inheritence();
        obj.set_car("Aadi");
        obj.set_acct_bal(10000.525);
        String car_name=obj.get_car();
        Double amount=obj.get_acct_bal();
        System.out.println("Car Name:"+car_name);
        System.out.println("Amount: "+amount);
    }
}

