import java.util.*;
public class leet_1929{
    public static void main(String[]args){
        int[]arr =  {1,2,1};
        int[]m = sol(arr);
        System.out.println(Arrays.toString(m));
    }
    static int[] sol(int[]arr){
        int n = arr.length;
        int[]ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        return ans;
    }
}