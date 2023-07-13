public class Account {
    String ID,Name;
    int Balance=0;
    Account(String ID,String Name)
    {
        this.ID=ID;
        this.Name=Name;
    }
    Account(String ID ,String Name, int Balance)
    {
        this.ID=ID;
        this.Name=Name;
        this.Balance=Balance;
    }
    String getID()
    {
        return ID;
    }
    String getName()
    {
        return Name;
    }
    int getBalance()
    {
        return Balance;
    }
    int credit(int amount)
    {
        Balance=Balance+amount;
        return Balance;
    }
    int debit(int amount)
    {
        if(amount<=Balance)
        {
            Balance=Balance-amount;
        }
        else
        {
            System.out.println("Amount Exceeded Balance!");
        }
        return Balance;
    }
    int transfetTo(Account another,int amount)
    {
        if(amount<=Balance)
        {
            Balance=Balance-amount;
            another.Balance=another.Balance+amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return Balance;
    }
    String toString(Account another)
    {
        String info;
        info="Account[ID="+another.ID+",Name="+another.Name+",Balance="+another.Balance+"]";
        return info;
    }
    public static void main(String args[])
    {
        Account mani=new Account("mani-001","Manikandan");

        System.out.println("Get ID from mani account : "+mani.getID());
        System.out.println("Get Name from mani account :"+mani.getName());
        System.out.println("Get Balance from muthu account : "+mani.getBalance());
        System.out.println("Credit amount to mani account : "+mani.credit(10000));
        System.out.println("Debit amount from mani account: "+mani.debit(10001));
        System.out.println("Mani Account Info: "+mani.toString(mani));
        System.out.println();
        
        Account muthu =new Account("muthu-001", "Muthu");
        
        System.out.println("Get ID from muthu account : "+muthu.getID());
        System.out.println("Get Name from muthu account : "+muthu.getName());
        System.out.println("Get Balance from muthu account :"+muthu.getBalance());
        System.out.println("Transfer from mani to muthu account : " + mani.transfetTo(muthu, 5000));
        System.out.println("Muthu account balance: "+muthu.getBalance());
        System.out.println("Muthu Account Info: "+muthu.toString(muthu));

    }
}