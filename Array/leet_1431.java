import java.util.*;
public class leet_1431{
    public static void main(String[]args){
        int[]candies = {2,3,5,1,3};
        int extraCandies = 3;
        // boolean[]ans = sol(candies,extraCandies);
        // System.out.println(Arrays.toString(ans));
        boolean[]ans = solution(candies,extraCandies);
        System.out.println(Arrays.toString(ans));
    }
    static boolean[] solution(int[] candies, int extraCandies) {
        int maximum = max(candies); // find maximum candies
        boolean[] res = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            // if this kid with extra candies >= max, mark true
            if (candies[i] + extraCandies >= maximum) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        return res;
    }
    static int max(int[]candies){
        int max = candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        return max;
    }
}