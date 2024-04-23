package per.bhj.classics150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.cn/problems/3sum/?envType=study-plan-v2&envId=top-interview-150">三数之和</a>
 *
 * @author noShampoo
 * @date 2024/3/17
 */
public class ThreeNumSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1,-1,-1,0};
        System.out.println(new ThreeNumSum().threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int length = nums.length;
        if (length < 3) {
            return ret;
        }
        if (length == 3 && Arrays.stream(nums).sum() == 0) {
            ret.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return ret;
        }
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return ret;
        }
        for (int i = 0; i < length; i++) {
            int left = i + 1;
            int right = length - 1;
            int now = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left < right) {
                int leftV = nums[left];
                int rightV = nums[right];
                int sum = now + leftV + rightV;
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    ret.add(Arrays.asList(now, leftV, rightV));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return ret;
    }
}
