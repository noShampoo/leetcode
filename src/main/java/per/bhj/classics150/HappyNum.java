package per.bhj.classics150;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150">202快乐数</a>
 *
 * @author noShampoo
 * @date 2024/4/18
 */
public class HappyNum {

    public static void main(String[] args) {
        System.out.println(new HappyNum().isHappy(2));
    }

    public boolean isHappy(int n) {
        List<Integer> happyList = new ArrayList<>();
        while (true) {
            int i = doHappy(n);
            if (i == 1) {
                return true;
            } else {
                if (happyList.contains(i)) {
                    return false;
                }
                happyList.add(i);
            }
            n = i;
        }
    }

    private int doHappy(int n) {
        int temp = n;
        int happy = 0;
        while (temp != 0) {
            int i = temp % 10;
            happy = happy + i * i;
            temp = temp / 10;
        }
        return happy;
    }
}
