import java.util.*;
public class leet_1672{
    public static void main(String[]args){
        int[][]nums = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(sol(nums));
    }
    static int sol(int[][]nums){
        int max = 0;
        for(int[]ans:nums){
            int sum = 0;
            for(int num:ans){
                sum = sum+num;
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}