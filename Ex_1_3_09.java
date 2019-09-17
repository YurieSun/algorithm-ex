/**
 * 目标：输入为缺少左括号的表达式，输出补全括号后的中序表达式
 * 此方法必须保证输入的表达式的每个数字与运算符都以空格隔开，否则无效。
 * 该如何解决键盘输入直接存入栈中？
 */
import java.util.Stack;

public class Ex_1_3_09{
    public static void main(String[] args) {
        String in = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        String[] s = in.split("\\s+");
        for (int i = 0; i < s.length; i++){
            if(s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s.equals("/"))
                ops.push(s[i]);
            else if(s[i].equals(")")){
                String a = vals.pop();
                vals.push("(" + vals.pop() + ops.pop() + a + ")");
            }
            else 
                vals.push(s[i]);
        }
        System.out.println(vals.pop());
    }
}