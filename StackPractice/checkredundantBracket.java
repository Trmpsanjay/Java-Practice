import java.util.Stack;

public class Solution {
    
    
    private static boolean checkOperator(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;
        return false;
    }
    
    
	
	public static boolean checkRedundantBrackets(String input) {
        Stack<Character> s= new Stack<>();
       
        for(int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '(' || checkOperator(ch))
                s.push(ch);
            else if (ch == ')'){
            	boolean hasOperator = false;
               	while(!s.isEmpty() && s.peek() != '('){
                   s.pop();
                   hasOperator = true;
               }
                if(!hasOperator)
                    return true;
                if(!s.isEmpty())
                	s.pop();
            }
        }
        
        return false;
        

	}
}



