
import java.util.*;
public class binarySearch2D{
    public static void main(String[]args){
        int[][]matrix = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
        };
        int target = 9;
        int[]ans = sol(matrix,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sol(int[][]matrix,int target){
        int r = 0;
        int c = matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }else if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}