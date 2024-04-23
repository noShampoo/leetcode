package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/search-insert-position/?envType=study-plan-v2&envId=top-interview-150">35. 搜索插入位置</a>
 *
 * @author noShampoo
 * @date 2024/4/22
 */
public class SearchInsert {

    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 1) {
            return nums[0] >= target ? 0 : 1;
        }

        int mid = length / 2;
        while (mid >= 0) {

            int num = nums[mid];
            if (num < target) {
                mid = (mid + length) / 2;
            } else {

            }

        }

        return 1;
    }
}
