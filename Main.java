public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.maxDivScore(new int[] { 4, 7, 9, 3, 9 }, new int[] { 5, 2, 3 }));
        System.out.println(sol.maxDivScore(new int[] { 20, 14, 21, 10 }, new int[] { 5, 7, 5 }));
        System.out.println(sol.maxDivScore(new int[] { 12 }, new int[] { 10, 16}));
    }
}