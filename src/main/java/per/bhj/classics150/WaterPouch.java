package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-interview-150">盛最多水的容器</a>
 *
 * @author noShampoo
 * @date 2024/3/14
 */
public class WaterPouch {

    public static void main(String[] args) {
        int[] h = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(new WaterPouch().maxArea(h));
    }

    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;

        int maxWater = Integer.MIN_VALUE;
        while (left < right) {
            int leftH = height[left];
            int rightH = height[right];

            maxWater = Math.max(maxWater, (right - left) * Math.min(leftH, rightH));

            if (leftH < rightH) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
