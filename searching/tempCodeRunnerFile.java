package searching;
public class orderAgnostic{
    public static void main(String[] args){
        int[]arr = {24,23,22,21,20,19,18,17};
        int target = 21;
        System.out.println(solution(arr,target));
    }
    static int solution(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target<arr[mid]){
                 start = mid+1;
                }else{
                    end = mid-1;
            }
        }

      
    }
    return -1;
}
}
