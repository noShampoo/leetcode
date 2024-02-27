package per.bhj.classics150;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150">合并两个有序数组</a>
 * @author noShampoo
 * @date 2024/01/29
 */
public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        int tempIndex = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while (index1 >= 0 && index2 >= 0 && tempIndex > 0) {
            nums1[tempIndex--] = nums1[index1] > nums2[index2] ? nums1[index1--] : nums2[index2--];
        }
        if (index2 >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, index2 + 1);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        new MergeArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;
        new MergeArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{0};
        nums2 = new int[]{1};
        m = 0;
        n = 1;
        new MergeArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{1, 2, 0, 0, 0, 0};
        nums2 = new int[]{1, 3, 5, 7};
        m = 2;
        n = 4;
        new MergeArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
