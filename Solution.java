import java.util.*;

public class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        List<Integer> divScores = new ArrayList<>(divisors.length);

        for (int index = 0; index < divisors.length; index++) {
            divScores.add(0);
        }

        for (int num : nums) {
            for (int index = 0; index < divisors.length; index++) {
                if (num % divisors[index] == 0)
                    divScores.set(index, divScores.get(index) + 1);

            }
        }
        
        System.out.println(divScores);
        
        
        
        return 0;
    }
}
