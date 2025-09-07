import java.util.*;
public class sliding{
    public static void main(String[]args){
        int[]arr = {2,1,5,1,3,2};
        int k = 3;
        int res=maxSumSubarray(arr,k);
        System.out.println(res);
    }
    static int maxSumSubarray(int[]arr,int k){
        int n = arr.length;
        int windowSum = initialWindowSum(arr,k);
        int maxSum = windowSum;

        for(int i=k;i<n;i++){
            windowSum = windowSum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    static int initialWindowSum(int[]arr,int k){
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}