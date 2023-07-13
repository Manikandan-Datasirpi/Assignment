import java.util.*;
public class Account1 
{
    String ID,Name;
    int Balance=0;
    
    Account1(String ID,String Name)
    {
        this.ID=ID;
        this.Name=Name;
    }
    Account1(String ID ,String Name, int Balance)
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
    int transferTo(Account1 another,int amount)
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
    String toString(Account1 another)
    {
        String info;
        info="Account[ID="+another.ID+",Name="+another.Name+",Balance="+another.Balance+"]";
        return info;
    }
    public static void main(String args[])
    {   
        String id,name;
        Account1[] arr;
        arr=new Account1[5];
        int i=0,amount,option;
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.println("WELCOME TO  SANDY BANK");
            System.out.println("**********************");
            System.out.println();
            System.out.println("1. Create a New Account");
            System.out.println("2. Credit to your Account");
            System.out.println("3. Debit from your Account");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer from your Account");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Enter your Choice: ");
            option=in.nextInt();
            if(option==1)
                {
                System.out.println("Enter your account ID: ");
                id=in.next();
                System.out.println("Enter your name: ");
                name=in.next(); 
                arr[i] =new Account1(id,name);
                i++;
                }
            else if(option==2)
                {
                System.out.println("Enter your account ID: ");
                id=in.next();
                System.out.println("Enter your name: ");
                name=in.next();
                System.out.println("Enter your amount to credit: ");
                amount=in.nextInt();
                for (int a=0;a<5;a++) {
                  System.out.println();
                   if(arr[a].ID.equals(id))
                   {
                        System.out.println("Your current balance: "+ arr[a].credit(amount));
                        break;
                    }
               }
            //    arr[0].credit(amount);
            //    System.out.println("Your current Balance: "+arr[0].Balance);
                }
            else if(option==3)
               {
                System.out.println("Enter your account ID: ");
                id=in.next();
                System.out.println("Enter your name: ");
                name=in.next();
                System.out.println("Enter your amount to debit: ");
                amount=in.nextInt();
                for (int a=0;a<5;a++) {
                  System.out.println();
                   if(arr[a].ID.equals(id))
                   {
                        System.out.println("Your current balance: "+ arr[a].debit(amount));
                        break;
                    }
               }
               }
            else if(option==4)
            {
                System.out.println("Enter your account ID: ");
                id=in.next();
                System.out.println("Enter your name: ");
                name=in.next();
                for (int a=0;a<5;a++) {
                  System.out.println();
                   if(arr[a].ID.equals(id))
                   {
                        System.out.println("Your current balance: "+ arr[a].getBalance());
                        break;
                    }
               }
            }
            else if(option==5)
            {
                System.out.println("Enter your account ID: ");
                id=in.next();
                System.out.println("Enter your name: ");
                name=in.next();
                for (int a=0;a<5;a++) {
                  System.out.println();
                   if(arr[a].ID.equals(id))
                   {
                        System.out.println("Enter ID and Name of Transfer account: ");
                        id=in.next();
                        name=in.next();
                        System.out.println("Enter your amount to transfer: ");
                        amount=in.nextInt();
                        for (int b=0;b<5;b++) {
                        if(arr[b].ID.equals(id))
                        {
                                arr[a].transferTo(arr[b], amount);
                                System.out.println("Your current Balance: "+arr[a].getBalance());
                                System.out.println("Your current Balance: "+arr[b].getBalance());
                                break;
                        }
                        }

                        break;
                    }
               }
            }
           else
        break;
        }
        in.close();
    }
}
