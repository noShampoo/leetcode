package per.bhj.classics150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <a href="https://leetcode.cn/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150">同构字符串</a>
 *
 * @author noShampoo
 * @date 2024/3/17
 */
public class IsomorphicStr {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(new IsomorphicStr().isIsomorphic(s, t));

        s = "paper";
        t = "title";
        System.out.println(new IsomorphicStr().isIsomorphic(s, t));

        s = "foo";
        t = "bar";
        System.out.println(new IsomorphicStr().isIsomorphic(s, t));

        s = "bbbaaaba";
        t = "aaabbbba";
        System.out.println(new IsomorphicStr().isIsomorphic(s, t));

        s = "badc";
        t = "baba";
        System.out.println(new IsomorphicStr().isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.isEmpty()) {
            return t.isEmpty();
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> isomorphicMapper = new HashMap<>();
        Map<Character, Character> reverseIsomorphicMapper = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            Character mapperChar = isomorphicMapper.getOrDefault(sChar, tChar);
            Character reverseMapperChar = reverseIsomorphicMapper.getOrDefault(tChar, sChar);
            if (!Objects.equals(mapperChar, tChar) || !Objects.equals(reverseMapperChar, sChar)) {
                return false;
            }
            isomorphicMapper.put(sChar, mapperChar);
            reverseIsomorphicMapper.put(tChar, reverseMapperChar);
        }
        return true;
    }
}
