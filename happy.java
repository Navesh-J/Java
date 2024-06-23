import java.util.Scanner;

class happy {
    public static int sum(int n) {
        int s=0;
        while (n > 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }

    public static boolean isHappy(int n) {
        //int happy=n;
        while(n>9)
        n=sum(n);
        if(n==1||n==7)
        return true;
        else
        return false;
    }
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(isHappy(n))
       System.out.println("Happy");
       else
       System.out.println("Not Happy");
       sc.close();
     }
}