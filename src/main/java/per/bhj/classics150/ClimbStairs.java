package per.bhj.classics150;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/climbing-stairs/?envType=study-plan-v2&envId=top-interview-150">70. 爬楼梯</a>
 *
 * @author noShampoo
 * @date 2024/4/19
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(6));
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i -2];
        }
        return dp[n];
    }
}
