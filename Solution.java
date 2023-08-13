import java.util.*;

public class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxDivScore = Integer.MIN_VALUE;
        int minDivisor = Integer.MAX_VALUE;
        Arrays.sort(divisors);
        for (int index = 0; index < divisors.length; index++) {
            int count = 0;
            for (int num : nums) {
                if (num % divisors[index] == 0)
                    count++;
            }
            if ((count > maxDivScore) || (count == maxDivScore && divisors[index] < minDivisor )){
                maxDivScore = count;
                minDivisor = divisors[index];
            }
        }
        return minDivisor;
    }
}
