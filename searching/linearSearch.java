package searching;
import java.util.*;

public class linearSearch
{
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
    int m = sol(arr,4);
    System.out.println(m);
    }
    static int sol(int arr[],int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}