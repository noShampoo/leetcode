package per.bhj.classics150;

import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150">20. 有效的括号</a>
 *
 * @author noShampoo
 * @date 2024/4/18
 */
public class KuoHao {

    public static void main(String[] args) {
        System.out.println(new KuoHao().isValid("()"));
        System.out.println(new KuoHao().isValid("()[]{}"));
        System.out.println(new KuoHao().isValid("(]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
            return false;
        }

        if (s.endsWith("(") || s.endsWith("[") || s.endsWith("{")) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add(')');
                continue;
            }
            if (c == '[') {
                stack.add(']');
                continue;
            }
            if (c == '{') {
                stack.add('}');
                continue;
            }

            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
