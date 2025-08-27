
import java.util.*;

public class findMin{
    public static void main(String[]args){
        int arr[] = {5,4,3,2,1};
        int m = min(arr);
        System.out.println(m);

    }
    static int min(int arr[]){
        int ans = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}