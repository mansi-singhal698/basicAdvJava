import java.util.*;
public class leet_1920{
    public static void main(String[]args){
        int[]arr = {0,2,1,5,3,4};
        int[]m = ans(arr);
        System.out.println(Arrays.toString(m));
    }
    static int[] ans(int[]arr){
        int[]ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[arr[i]];
        }

        return ans;
    }
}
//Output: [0,1,2,4,5,3]