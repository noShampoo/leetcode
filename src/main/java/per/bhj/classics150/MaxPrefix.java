package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150">最长公共前缀</a>
 *
 * @author noShampoo
 * @date 2024/3/12
 */
public class MaxPrefix {

    public static void main(String[] args) {
        String[] arrays = new String[] {"dog","racecar","car"};
        System.out.println(new MaxPrefix().longestCommonPrefix(arrays));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder maxPrefix = new StringBuilder();
        char[] str0CharArray = strs[0].toCharArray();
        char[] str1CharArray = strs[1].toCharArray();
        for (int i = 0; i < str0CharArray.length; i++) {
            if (i >= str1CharArray.length) {
                break;
            }
            if (str0CharArray[i] != str1CharArray[i]) {
                break;
            }
            maxPrefix.append(str0CharArray[i]);
        }

        for (int i = 2; i < strs.length; i++) {
            String str = strs[i];
            if (str == null) {
                return "";
            }
            if (str.startsWith(maxPrefix.toString())) {
                continue;
            }
            int maxLen = Math.min(str.length(), maxPrefix.length());
            int k = 0;
            for (; k < maxLen; k++) {
                if (str.charAt(k) != maxPrefix.charAt(k)) {
                    break;
                }
            }

            maxPrefix.delete(k, maxPrefix.length());
        }
        return maxPrefix.length() == 0 ? "" : maxPrefix.toString();
    }
}