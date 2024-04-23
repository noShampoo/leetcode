package per.bhj.classics150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/combinations/?envType=study-plan-v2&envId=top-interview-150">77. 组合</a>
 *
 * @author noShampoo
 * @date 2024/4/18
 */
public class Combine {

    public static void main(String[] args) {
        List<List<Integer>> combine = new Combine().combine(3, 3);
        System.out.println(combine);
    }

    List<List<Integer>> ret = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTrack(n, k, 1);
        return ret;
    }

    public void backTrack(int n, int k, int startIndex) {
        if (path.size() == k) {
            ret.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            if (!path.isEmpty() && i <= path.getLast()) {
                continue;
            }
            path.add(i);
            backTrack(n, k, startIndex + 1);
            path.removeLast();
        }
    }
}
