import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        System.out.println(checkBracket("[({})]"));
        System.out.println(checkBracket("[]{}()"));
        System.out.println(checkBracket("[{)]"));
        System.out.println(checkBracket("[{"));
    }

    public static boolean checkBracket(String str) {
        char[] inputAsChar = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputAsChar.length; i++) {
            char c = inputAsChar[i];
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']' || c == ')' || c == '}') {
                char leftSide = stack.pop();
                if (leftSide == '[' && c == ']') {
                    return true;
                } else if (leftSide == '(' && c == ')') {
                    return true;
                } else if (leftSide == '{' && c == '}') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
