import java.util.*;
public class leet_1470{
    public static void main(String[]args){
        int[]arr = {2,5,1,3,4,7};
        int n= 3;
        int[]ans = sol(arr,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sol(int[]arr,int n){
        int[]res = new int[2*n];
        int index = 0;
        for(int i = 0;i<n;i++){
            res[index] = arr[i];
            index = index+1;
            res[index] = arr[i+n];
            index = index+1;
        }

        return res;
    }
}