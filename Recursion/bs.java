import java.util.*;
public class bs{
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        System.out.println(sol(arr,target,0,arr.length-1));
    }

    static int sol(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(target == arr[m]){
            return m;
        }
        if(target<arr[m]){
            return sol(arr,target,s,m-1);
        }
        return sol(arr,target,m+1,e);
    }
}