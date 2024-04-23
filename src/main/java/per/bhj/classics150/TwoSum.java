package per.bhj.classics150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 替换类描述
 *
 * @author noShampoo
 * @date 2024/4/11
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num4IndexMap = IntStream.range(0, nums.length).boxed().collect(Collectors.toMap(i -> nums[i], i -> i, (a, b) -> b));
        for (int i = 0; i < nums.length; i++) {
            Integer index = num4IndexMap.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[]{i, index};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));

        nums = new int[] {3, 2, 4};
        target = 6;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));


        nums = new int[] {3, 3};
        target = 6;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }

}
