import java.util.*;
// import java.io.*;
class datatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        //no. of test cases
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try{
            //enter the number
           long n=sc.nextLong();
           if(n>=-Math.pow(2,63)&&n<=Math.pow(2,63)-1)
           {
            System.out.println(n+"can be fitted in:");
           if(n>=-128&&n<=127)
           System.out.println("* byte");
           if(n>=-32768&&n<=32767)
           System.out.println("* short");
           if(n>=-Math.pow(2,31)&&n<=Math.pow(2,31)-1)
           System.out.println("* int");
           if(n>=-Math.pow(2,63)&&n<=Math.pow(2,63)-1)
           System.out.println("* long");
           }
        }
           catch(Exception e)
           {
           System.out.println(sc.next()+" can't be fitted anywhere.");
           }
        }
        sc.close();
    }
}
