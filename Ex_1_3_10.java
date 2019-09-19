/**
 * 目标：将中序表达式变成后序表达式
 * 此方法必须保证中序表达式的所有括号都不能省略，不管优先级如何。
 * 且输入的表达式的每个数字与运算符都以空格隔开，否则无效。
 * 该如何解决键盘输入直接存入栈中？
 */
import java.util.Stack;

public class Ex_1_3_10{
    public static void main(String[] args) {
        String in = "( 2 + ( 3 + 4 ) * ( 5 * 6 ) ) )";
        String[] s = in.split("\\s+");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++){
            if (s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s[i].equals("/"))
                stack.push(s[i]);
            else if (s[i].equals("("))
                System.out.print("");
            else if (s[i].equals(")"))
                System.out.print(stack.pop() + " ");
            else
                System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}