package per.bhj.classics150;

import java.util.Arrays;

/**
 * 替换类描述
 *
 * @author noShampoo
 * @date 2024/4/11
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hashArr = new int[26];
        for (char c : s.toCharArray()) {
            hashArr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            hashArr[c - 'a']--;
        }
        return Arrays.stream(hashArr).allMatch(o -> o == 0);
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(new IsAnagram().isAnagram(s, t));

        s = "rat";
        t = "car";
        System.out.println(new IsAnagram().isAnagram(s, t));

    }
}
