import java.util.*;
public class firstNegNumber{
    public static void main(String[]args){
        int[]arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int[]res = firstNeg(arr,k);
        System.out.println(Arrays.toString(res));
    }
    static int[] firstNeg(int[]arr,int k){
        int n = arr.length;
        int[]ans = new int[n-k+1];
        Deque<Integer> q = new LinkedList<>();
        int index = 0;

        for(int i=0;i<k;i++){
            if(arr[i]<0){
                q.addLast(i);
            }
        }

        ans[index++] = q.isEmpty()?0:arr[q.peekFirst()];
        for(int i=k ;i<n;i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
            }
            if(arr[i]<0){
                q.addLast(i);
            }

            ans[index++] = q.isEmpty()?0:arr[q.peekFirst()];
        }

        return ans;
    }
}