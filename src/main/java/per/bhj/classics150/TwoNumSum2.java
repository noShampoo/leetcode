package per.bhj.classics150;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150">两数之和 II - 输入有序数组</a>
 *
 * @author noShampoo
 * @date 2024/3/14
 */
public class TwoNumSum2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(new TwoNumSum2().twoSum(nums, 9)));
    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[2];
        }
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[2];
    }

}
