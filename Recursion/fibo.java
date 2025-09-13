import java.util.*;
public class fibo{
    public static void main(String[]args){
        System.out.println(sol(6));
    }
    static int sol(int n){
        if(n<2){
            return n;
        }
        return sol(n-1)+sol(n-2);
    }
}  