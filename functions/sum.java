package functions;
import java.util.*;

public class sum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sol(a,b);
    }
    static void sol(int a,int b){
        System.out.println(a+b);
    }
}