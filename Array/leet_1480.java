import java.util.*;
public class leet_1480{
    public static void main(String[]args){
        int[]arr = {1,2,3,4};
        int[]m = sol(arr);
        System.out.println(Arrays.toString(m));
    }

    static int[] sol(int[]arr){
        int n = arr.length;
        int[]ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1;i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}