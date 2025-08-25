package searching;
import java.util.*;

public class findnumbers{
    public static void main(String[]args){
        int[]arr = {12,123,1234,12345,66};
        System.out.println(number(arr));
    }
    static int number(int[]arr){
        int count = 0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numOfDigits = digits(num);
        if(numOfDigits%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
