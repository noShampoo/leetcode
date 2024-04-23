package per.bhj.classics150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/combination-sum/?envType=study-plan-v2&envId=top-interview-150">39. 组合总和</a>
 *
 * @author noShampoo
 * @date 2024/4/19
 */
public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        System.out.println(new CombinationSum().combinationSum(candidates, target));

        candidates = new int[] {2, 3, 5};
        target = 8;
        System.out.println(new CombinationSum().combinationSum(candidates, target));
    }

    List<List<Integer>> ret = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, target);
        return ret;
    }

    public void backTrack(int[] candidates, int target) {
        int sum = path.stream().reduce(0, Integer::sum);
        if (sum == target) {
            ret.add(new ArrayList<>(path));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int candidate : candidates) {
            if (path.stream().anyMatch(o -> o > candidate)) {
                continue;
            }
            path.add(candidate);
            backTrack(candidates, target);
            path.removeLast();
        }
    }
}
