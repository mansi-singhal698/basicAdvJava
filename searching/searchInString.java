package searching;
import java.util.*;

public class searchInString{
    public static void main(String[]args){
        String name = "deepali";
        char target = 'p';
        int m = solution(name,target);
        System.out.println(m);
    }
    static int solution(String str, char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0;i<str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}