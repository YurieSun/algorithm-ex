import java.util.Stack;

public class Ex_1_3_04{
    public static void main(String[] args) {
        String s = "[{})]";
        System.out.println(isComplete(s));
    }
    public static boolean isComplete(String s){
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') 
                parentheses.push(c);
            else if (c == ')'){
                char m = parentheses.pop();
                if (m != '(')
                    return false;
            } 
            else if (c == ']'){
                char m = parentheses.pop();
                if (m != '[')
                    return false;
            } 
            else if (c == '}'){
                char m = parentheses.pop();
                if (m != '{')
                    return false;
            } 
        }
        if (!parentheses.isEmpty())
                return false;
            return true;
    }
}