import java.util.Stack;

public class Solution {

	public static boolean isBalanced(String exp) { 
        Stack<Character> s = new Stack<>();
      	
        
		// iterating through all the charecters
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='['){
                s.push(exp.charAt(i));
                continue;
            }
            if(exp.charAt(i)=='}'  && !s.isEmpty() && s.peek()=='{' ){
                s.pop();
                continue;
            }
            else if(exp.charAt(i)==')' && !s.isEmpty() && s.peek()=='(' ){
                s.pop();
                continue;
            }
            else if(exp.charAt(i)==']' && !s.isEmpty() && s.peek()=='[' ){
                s.pop();
                continue;
            }
            else
                return false;
        }
        if(s.isEmpty())
            return true;
        else
            return false;

	}
}