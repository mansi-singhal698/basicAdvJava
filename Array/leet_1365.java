import java.util.*;
public class leet_1365{
    public static void main(String[]args){
        int[]arr = {8,1,2,2,3};
        int[]ans = smallerNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbers(int[]arr){
        int[]res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;i<arr.length;j++){
                if(arr[j]<arr[i]){
                 count = count + 1;
                }
            }
            res[i] = count;
        }
        return res;
    }
}