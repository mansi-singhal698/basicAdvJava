package searching;
import java.util.*;

public class searchIn2DArray{
    public static void main(String[]args){
        int[][]arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 2;
        int[]ans = solution(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solution(int[][]arr,int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }

}