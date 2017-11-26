 
import java.util.*;
 
class Test
{
    static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
      
    private void infixToPostfix(String exp)
    {
        String result = new String("");
         
        Stack<Character> stack = new Stack<>();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             
            if (Character.isLetterOrDigit(c))
                result += c;
              
            else if (c == '(')
                stack.push(c);
             
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                 
                if (!stack.isEmpty() && stack.peek() != '(')
                   System.out.println("Invalid Expression");
                else
                    stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
      
        }
        while (!stack.isEmpty())
            result += stack.pop();
      
        System.out.println(result);
    }
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = new String();
        str = sc.next();
        Test itp = new Test();
        itp.infixToPostfix(str);
    }
}
