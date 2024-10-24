import java.util.Scanner;

class Arthmtc
{
    public void arthoprn(int a,int b)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.modulodivision");
        System.out.println("division");
        int choice=sc.nextInt();
        int c=0;
        switch(choice)
        {
            case 1:if(choice==1)
            {
               System.out.println(c=a+b);
            }
            break;
            case 2:if(choice==2)
            {
                System.out.println(c=a-b);
            }
            break;
            case 3:if(choice==3)
            {
                System.out.println(c=a*b);
            }
            break;
            case 4:if(choice==4)
            {
                System.out.println(c=a%b);
            }
            break;
            case 5:if(choice==5)
            {
                System.out.println(c=a/b);
            }
            break;
            default:System.out.println("invalid choice enter valid choice");
        }
        
    }
}


class Hello
{
    public static void main(String args[])
    {
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        System.out.println("enter b value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Arthmtc ob=new Arthmtc();
        ob.arthoprn(a, b);
        boolean s=true;
        while(s)
        {
            System.out.println("do you want continue press 1 if not press 0");
            int option=sc.nextInt();
            
            if(option==1)
            {
                ob.arthoprn(a, b);
            }
            else
            {
                System.out.println("Thankyou....!!!!!!!!!!");
                s=false;
            }
        }

    }
}