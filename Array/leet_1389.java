import java.util.*;
public class leet_1389{
    public static void main(String[]args){
        int[]arr = {0,1,2,3,4};
        int[]index = {0,1,2,2,1};
        int[]ans = target(arr,index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] target(int[]arr,int[]index){
        ArrayList <Integer> list = new ArrayList <>();
        for(int i=0;i<arr.length;i++){
            list.add(index[i],arr[i]);
        }
        int[]target = new int[list.size()];
        for(int i=0;i<list.size();i++){
            target[i] = list.get(i);
        }
        return target;
    }
}