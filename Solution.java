import java.util.*;

public class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        List<Integer> divScores = new ArrayList<>(divisors.length);
        List<Integer> maxDivScoreIndeces = new ArrayList<>();
        int maxDivScore = -10000;
        int minDivisor = 1000000000;

        for (int num : nums) {
            for (int index = 0; index < divisors.length; index++) {

                if (divScores.size() <= index)
                    divScores.add(0);

                if (num % divisors[index] == 0)
                    divScores.set(index, divScores.get(index) + 1);

            }
        }

        for (int i = 0; i < divScores.size(); i++) {
            if (divScores.get(i) == maxDivScore) {
                maxDivScoreIndeces.add(i);
                continue;
            }

            if (divScores.get(i) > maxDivScore) {
                maxDivScore = divScores.get(i);
                maxDivScoreIndeces = new ArrayList<>();
                maxDivScoreIndeces.add(i);
                System.gc();
            }
        }
        
        for (int index : maxDivScoreIndeces) {
            if (divisors[index] < minDivisor)
                minDivisor = divisors[index];
        }

        return minDivisor;
    }
}
