// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
// Example 1:
// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:
// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:
// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25
import java.util.*;
class pow {
    public static double myPow(double x, int n) {
        return (Math.pow(x, n));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        double x=sc.nextDouble();
        System.out.println("Enter Power");
        int n=sc.nextInt();
        double res=myPow(x, n);
        System.err.printf("%.5f",res);
        sc.close();
    }
}