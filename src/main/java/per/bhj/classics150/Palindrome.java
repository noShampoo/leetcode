package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150">验证回文串</a>
 *
 * @author noShampoo
 * @date 2024/3/13
 */
public class Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new Palindrome().isPalindrome(s));
        s = "race a car";
        System.out.println(new Palindrome().isPalindrome(s));
        s = "0P";
        System.out.println(new Palindrome().isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        char[] charArray = s.toLowerCase().trim().toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char leftChar = charArray[left];
            if (!Character.isDigit(leftChar) && ('a' > leftChar || leftChar > 'z')) {
                left++;
                continue;
            }
            char rightChar = charArray[right];
            if (!Character.isDigit(rightChar) && ('a' > rightChar || rightChar > 'z')) {
                right--;
                continue;
            }
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
