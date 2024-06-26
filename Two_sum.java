// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.*;
public class Two_sum {
    public static int[] twoSum(int[] nums, int target){
        int l=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if((nums[i]+nums[j])==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int arr[]=twoSum(ar,target);
        for(int i=0;i<2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
