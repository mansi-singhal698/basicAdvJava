package functions;
import java.util.*;
public class prime{
    public static void main(String[]args){
        boolean ans = isPrime(7);
        System.out.println(ans);
    }
     static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}