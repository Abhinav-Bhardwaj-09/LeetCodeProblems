package ValidParentheses;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 16/01/2026
 * Time: 14:40
 */

public class Solution {
    public boolean isValid(String s) {
        if(Objects.isNull(s) || s.length() == 1) {
            return false;
        }

        Deque<Character> paranthesesStack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                paranthesesStack.push(c);
            } else {
                if(paranthesesStack.isEmpty()) {
                    return false;
                }
                char poppedChar = paranthesesStack.pop();
                if(c == ')' && poppedChar != '(') {
                    return false;
                } else if (c == ']' && poppedChar != '[') {
                    return false;
                }
                else if (c == '}' && poppedChar != '{') {
                    return false;
                }
            }
        }

        return paranthesesStack.isEmpty();
    }
}