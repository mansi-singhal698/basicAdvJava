import java.util.*;
public class prefixSum{
    public static void main(String[]args){
        int[]arr = {2,1,3,4,5};
        // int[]ans = pattern(arr);
        // System.out.println(Arrays.toString(ans));
        sol2(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sol1(int[]arr){
        int n = arr.length;
        int[]pref = new int[n];
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }

    static void sol2(int[]arr){
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
}