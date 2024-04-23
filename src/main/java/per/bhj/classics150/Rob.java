package per.bhj.classics150;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/house-robber/description/?envType=study-plan-v2&envId=top-interview-150">198. 打家劫舍</a>
 *
 * @author noShampoo
 * @date 2024/4/19
 */
public class Rob {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 1};
        System.out.println(new Rob().rob(nums));
    }

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }
}
