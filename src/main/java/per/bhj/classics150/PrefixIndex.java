package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150">找出字符串中第一个匹配项的下标</a>
 *
 * @author noShampoo
 * @date 2024/3/13
 */
public class PrefixIndex {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(new PrefixIndex().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || haystack.isEmpty()) {
            return -1;
        }
        if (needle == null || needle.isEmpty()) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i).startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }

}
