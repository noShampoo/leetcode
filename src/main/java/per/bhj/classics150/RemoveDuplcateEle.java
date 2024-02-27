package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">26. 删除有序数组中的重复项</a>
 *
 * @author noShampoo
 * @date 2024/1/29
 */
public class RemoveDuplcateEle {

    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(new RemoveDuplcateEle().removeDuplicates(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new RemoveDuplcateEle().removeDuplicates(nums));
    }
}
