package per.bhj.classics150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/permutations/description/?envType=study-plan-v2&envId=top-interview-150">46. 全排列</a>
 *
 * @author noShampoo
 * @date 2024/4/19
 */
public class Permute {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3};
        Permute permute = new Permute();
        permute.permute(nums);
        System.out.println(permute.ret);
    }

    List<List<Integer>> ret = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums);
        return ret;
    }

    public void backTrack(int[] nums) {
        if (path.size() == nums.length) {
            ret.add(new ArrayList<>(path));
            return;
        }
        for (int num : nums) {
            if (path.contains(num)) {
                continue;
            }
            path.add(num);
            backTrack(nums);
            path.removeLast();
        }
    }
}
