import java.util.*;
public class greater {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a ,b;
        System.out.print("Enter first number= ");
        a=sc.nextInt();
        System.out.print("Enter second number= ");
        b=sc.nextInt();
        if(a<b)
        {
            System.out.println(a + " is grater ");

        }
        else if(a>b)
        {
            System.out.println(b + " is grater ");
        }
        else
        {
            System.out.println(a + " and " + b + " are equal ");
        }
    }
}

