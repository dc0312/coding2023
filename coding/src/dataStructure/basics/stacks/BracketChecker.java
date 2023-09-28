package dataStructure.basics.stacks;

import java.util.Stack;

public class BracketChecker {

    private boolean checkBracket(String val) {
        char[] charArr = val.toCharArray();

        Stack<Character> st = new Stack<>();

        for (char ch : charArr) {
            switch (ch) {
                case '[', '{', '(' -> st.push(ch);
                case '}', ']', ')' -> {
                    if (st.isEmpty()) {
                        return false;
                    }
                    if (ch == '}' && st.peek().equals('{')) {
                        st.pop();
                    } else if (ch == ']' && st.peek() == '[') {
                        st.pop();
                    } else if (ch == ')' && st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                default -> {
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BracketChecker checker = new BracketChecker();
        System.out.println("Check a[b{c}d]e : " + checker.checkBracket("a[b{c}d]e"));
        System.out.println("Check a[b(c}d]e : " + checker.checkBracket("a[b(c}d]e"));
        System.out.println("Check a[b(c}de : " + checker.checkBracket("a[b(c}de"));
        System.out.println("Check a[b(c)de]]] : " + checker.checkBracket("a[b(c)de]]]"));
    }
}
