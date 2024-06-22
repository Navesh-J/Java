import java.util.*;

public class binarySearch {
    public static int searchInsert(int[] nums, int target) {
        int start = 0, last = nums.length-1, mid;
        while (last >= start) {
            mid = start + (last - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                last = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int res = searchInsert(arr, target);
        if (res == -1)
            System.out.println("Not Found");
        else
            System.out.println("target is at index : " + res);
        sc.close();
    }
}
