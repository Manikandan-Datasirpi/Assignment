import java.util.Scanner;

public class Condition {
    public static void main(String args[])
    {
//        //Conditional Statement
//
//        int age=21;
//        if(age>=18)
//        {
//            System.out.println("Eligible to put vote..");
//        }
//        else
//        {
//            System.out.println("Not Eligible to put vote");
//        }
//        //
//        Scanner in = new Scanner(System.in);
//        int num;
//        System.out.println("Enter you number: ");
//        num=in.nextInt();
//        if(num>0)
//        {
//            System.out.println("Given number is positive");
//        }
//        else if(num<0)
//        {
//            System.out.println("Given number is negative");
//        }
//        else
//        {
//            System.out.println("Given number is zero");
//        }
//        //
//        float mark;
//        System.out.println("Enter you mark: ");
//        mark=in.nextFloat();
//        if(mark>=40)
//        {
//            System.out.println("Result: Pass");
//            if(mark>=90)
//            {
//                System.out.println("Grade: A");
//
//            }
//            else if(mark>=80 && mark<90)
//            {
//                System.out.println("Grade: B");
//            }
//            else if(mark>=70 && mark<80)
//            {
//                System.out.println("Grade: C");
//            }
//            else if(mark>=40 && mark<70)
//            {
//                System.out.println("Grade: D");
//            }
//        }
//        else
//        {
//            System.out.println("Result: Fail");
//        }
//        //
//        char letter;
//        System.out.println("Enter you Letter: ");
//        letter=in.next().charAt(0);
//        switch(letter)
//        {
//            case 'A':
//            case 'a':
//            case 'E':
//            case 'e':
//            case 'I':
//            case 'i':
//            case 'O':
//            case 'o':
//            case 'U':
//            case 'u':
//                System.out.println("Given Letter is vowel");
//                System.out.println("Hi Im Manikandan");
//                break;
//            default:
//                System.out.println("Give Letter is Consonants ");
//                break;
//        }
        // Looping statement

        //while loop
        int n=0;
        while(n<=10)
        {
            System.out.println(n);
            n=n+2;
        }
        // Do-while Loop
        int a=1;
        do
        {
            System.out.println(a);
            a=+2;
        }while(a<=0);

        for(int i=1;i<=10;i=i+2)
        {
            System.out.println(i);
        }
        int b[]={1,2,3,4,5};
        for(int i=b.length-1;i>=0;i--)
        {
            System.out.println(b[i]);
        }
        for(int c:b)
        {
            System.out.println(c);
        }
        //Nested Loop --Continue -- Break

        for(int i=0;i<6;i++)
        {
            if(i==2)
            {
                continue;
            }
            if(i==4)
            {
                break;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Label
        a:
        for(int i=0;i<6;i++)
        {
            b:
            for(int j=0;j<=i;j++)
            {
                if(j==4)
                {
                    break b;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
