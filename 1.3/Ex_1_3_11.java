/**
 * 目标：将后序表达式求职并打印
 * 此方法必须保证输入的表达式的每个数字与运算符都以空格隔开，否则无效。
 * 该如何解决键盘输入直接存入栈中？
 */
import java.util.Stack;

public class Ex_1_3_11{
    public static void main(String[] args) {
        //中序表达式为( 2 + ( 3 + 4 ) * ( 5 * 6 ) ) )
        String in = "2 3 4 + 5 6 * * +";
        String[] s = in.split("\\s+");
        Stack<Double> vals = new Stack<>();
        for (int i = 0; i < s.length; i++){
            if (s[i].equals("+")){
                double v = vals.pop();
                v = vals.pop() + v;
                vals.push(v);
            }
            else if (s[i].equals("-")){
                double v = vals.pop();
                v = vals.pop() - v;
                vals.push(v);
            }
            else if (s[i].equals("*")){
                double v = vals.pop();
                v = vals.pop() * v;
                vals.push(v);
            }
            else if (s[i].equals("/")){
                double v = vals.pop();
                v = vals.pop() / v;
                vals.push(v);
            }
            else
                vals.push(Double.parseDouble(s[i]));    
        }
        System.out.println(vals.pop());
    }
}