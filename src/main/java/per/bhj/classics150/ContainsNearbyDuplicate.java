package per.bhj.classics150;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150">219. 存在重复元素 II</a>
 *
 * @author noShampoo
 * @date 2024/4/11
 */
public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        if (nums.length < k) {
            return false;
        }

        Map<Integer, Integer> minNumIndexMapper = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer index = minNumIndexMapper.getOrDefault(num, i);
            if (i == index) {
                minNumIndexMapper.put(num, index);
            } else if (i - index <= k) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1,0,1,1};
        int k = 1;
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums, k));
    }
}
