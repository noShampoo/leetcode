package per.bhj.classics150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150">赎金信</a>
 *
 * @author noShampoo
 * @date 2024/3/17
 */
public class ShuJinXin {

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(new ShuJinXin().canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";
        System.out.println(new ShuJinXin().canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";
        System.out.println(new ShuJinXin().canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomNoteCharNums = new int[26];
        for (char c : ransomNote.toCharArray()) {
            ransomNoteCharNums[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            ransomNoteCharNums[c - 'a']--;
        }
        return Arrays.stream(ransomNoteCharNums).allMatch(o -> o <= 0);
    }
}
