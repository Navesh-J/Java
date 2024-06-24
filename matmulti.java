import java.io.*;
class matmulti
{
   public static void main(String args[])throws IOException
    {
        int a[][]=new int[10][10];
        int b[][]=new int [10][10];
        int c[][]=new int[10][10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of matrix 1 ");
        int r1=Integer.parseInt(br.readLine());
        int c1=Integer.parseInt(br.readLine());
        System.out.println("Enter size of matrix 2 ");
        int r2=Integer.parseInt(br.readLine());
        int c2=Integer.parseInt(br.readLine());
        System.out.println("Enter elements of matrix 1");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Enter elements of matrix 2");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=Integer.parseInt(br.readLine());
            }
        }
        if(c1==r2)
        {
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    c[i][j]=0;
                    for(int k=0;k<r2;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Matrix 1:-");
            for(int i=0;i<r1;i++)
         {
            for(int j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
         }
          System.out.println("Matrix 2:-");
            for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
         System.out.println("Matrix after multiplication:-");
            for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

        }
        else
        System.out.println("Matrix multiplication not possible");
    }
}