package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150">27. 移除元素</a>
 *
 * @author noShampoo
 * @date 2024/01/29
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if (num != val) {
                nums[count++] = num;
            }
        }
        return count;
    }

    public int removeElement1(int[] nums, int val) {
        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[--count];
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        System.out.println(new RemoveElement().removeElement(nums, val));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        System.out.println(new RemoveElement().removeElement(nums, val));




        nums = new int[]{3, 2, 2, 3};
        val = 3;
        System.out.println(new RemoveElement().removeElement1(nums, val));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        System.out.println(new RemoveElement().removeElement1(nums, val));
    }
}
