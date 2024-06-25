import java.util.*;
public class righttriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a*a==(b*b)+(c*c)||b*b==(a*a)+(c*c)||c*c==(b*b)+(a*a))
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}
