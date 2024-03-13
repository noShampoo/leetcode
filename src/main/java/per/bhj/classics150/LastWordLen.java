package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150">最后一个单词的长度</a>
 *
 * @author noShampoo
 * @date 2024/3/13
 */
public class LastWordLen {

    public static void main(String[] args) {
        String test = "Hello World";
        System.out.println(new LastWordLen().lengthOfLastWord(test));
        test = "   fly me   to   the moon  ";
        System.out.println(new LastWordLen().lengthOfLastWord(test));
        test = "luffy is still joyboy";
        System.out.println(new LastWordLen().lengthOfLastWord(test));
    }

    public int lengthOfLastWord1(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String trimmed = s.trim();

        String[] s1 = trimmed.split(" ");
        for (int i = s1.length - 1; i >= 0; i--) {
            String s2 = s1[i];
            if (s2 == null || s2.isEmpty()) {
                continue;
            }
            if (!s2.startsWith(" ")) {
                return s2.length();
            }
        }
        return 0;
    }



    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String trimmed = s.trim();
        for (int i = trimmed.length() - 1; i >= 0; i--) {
            if (' ' == trimmed.charAt(i)) {
                return trimmed.length() - 1 - i;
            }
        }
        return trimmed.length();
    }
}
