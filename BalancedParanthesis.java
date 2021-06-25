import java.util.Stack;

public class Solution {

	public static boolean checkBalanced(String exp) { 
        Stack<Character> s = new Stack<>();
      for(int i=0;i<exp.length();i++){
          if( exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='['){
              s.push(exp.charAt(i));
          }
          if( exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']'){
              if(s.isEmpty())
                  return false;
              char temp= s.pop();
              if(exp.charAt(i)==')' && temp=='(')
                  continue;
              else if(exp.charAt(i)=='}' && temp=='{')
                  continue;
              else if(exp.charAt(i)==']' && temp=='[')
                  continue;
              else
                  return false;
          }
              
      }
        if(s.isEmpty())
        	return true;
        else
            return false;
		// Write your code here

	}
}
