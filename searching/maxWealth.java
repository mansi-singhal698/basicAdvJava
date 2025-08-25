package searching;
import java.util.*;

public class maxWealth{
    public static void main(String[]args){
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int ans = 0; 
       for(int[]anInts:arr){
            int sum = 0;
            for(int anInt:anInts){
                sum = sum + anInt;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}