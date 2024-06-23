import java.util.*;
class fibonacci
{
    public static void main(String[] args)
    {
        int c=0,a=0,b=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(a+"  ");
            c=a+b;
            a=b;
            b=c;
            
        }
        sc.close();
    }
}