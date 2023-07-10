import java.util.*;
class Data
{
    public Boolean expression(String expression)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<expression.length(); i++) 
        {
            char ch=expression.charAt(i);
            if(ch=='('|| ch=='{'||ch=='[') 
            {
                  stack.push(ch);
            }
            else if(stack.isEmpty()) 
            {
                return false;
            }
            else if(ch==')' && stack.peek()=='(') {
                    stack.pop();
            }
            else if(ch=='}' && stack.peek()=='{') 
            {
                stack.pop();
            }
            else if(ch==']' && stack.peek()=='[') 
            {
                stack.pop();
            }
            else 
            {
                return false;
            }            
        }
        if(stack.isEmpty()) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
public static void main(String args[])
{
    int i,n,sum=0,x;
    System.out.println("Enter number of elemets to enter: ");
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("Enter your Array element: ");
    for(i=0;i<n;i++)
    {
        a[i]=obj.nextInt();
        sum+=a[i];
    }
    System.out.println("Sum of your array : "+ sum);
    LinkedList<Integer> linkedList=new LinkedList<>();
    System.out.println("Enter " + n + " number of values:");
    for(i=0;i<n;i++)
    {
        x=obj.nextInt();
        linkedList.add(x);
    }
    Stack <Integer> stack=new Stack<>();
    for(i=n-1;i>=0;i--)
    {
        stack.push(linkedList.get(i));
    }
    Queue <Integer> queue=new LinkedList<>();
    for(i=0;i<n;)
    {
        queue.add(linkedList.get(i));
        i=i+2;
    }

    Map<Integer,String> map=new HashMap<>();
        map.put(1, "Cat");
        map.put(2, "Dog");
        map.put(3, "Rat");
        map.put(4, "Cow");
    System.out.println("Linked List : " + linkedList);
    System.out.println("Stack : " + stack);
    System.out.println("Queue : " + queue);
    System.out.println("Map : " + map);
    System.out.println();
    System.out.println("Enter your Expression: ");
    String exp=obj.next();
    Data in=new Data();
    if(in.expression(exp))
    {
        System.out.println("Expression is valid");
    }
    else
    {
        System.out.println("Expression is not valid");
    }
    obj.close();
}
}