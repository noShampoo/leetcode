package per.bhj.classics150;

import java.util.Objects;

/**
 * <a href="https://leetcode.cn/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150">判断子序列</a>
 *
 * @author noShampoo
 * @date 2024/3/13
 */
public class StrSub {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(new StrSub().isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        if (t == null) {
            return false;
        }
        if (s == null) {
            return false;
        }
        int length4t = t.length();
        int length4s = s.length();
        if (length4t < length4s) {
            return false;
        }
        if (length4t == length4s) {
            return Objects.equals(t, s);
        }

        int index4t = 0;
        int index4s = 0;
        while (index4s < length4s && index4t < length4t) {
            if (t.charAt(index4t) == s.charAt(index4s)) {
                index4s++;
            }
            index4t++;
        }
        return index4s == length4s;
    }
}
