import java.util.*;
public class movesZero{
    public static void main(String[]args){
        int[]arr = {2,0,3,0,9};
        sol(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sol(int[]arr){
        int left = 0; //Pointer for placing non-zero elements

        for(int right = 0; right<arr.length;right++){
            if(arr[right] != 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }
}