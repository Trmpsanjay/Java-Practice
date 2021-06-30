import java.util.Stack;
import java.lang.Math;
public class Solution {
   public static int countBracketReversals(String input){
       int length=input.length();
       if(length%2!=0)
           return -1;
       Stack<Character> s = new Stack<Character>();
       for(int i=0;i<length;i++){
           // if opening bracket push it without thinking
           if(input.charAt(i)=='{')
               s.push(input.charAt(i));
           // if closing bracket check following 3 comditions
           if(input.charAt(i)=='}'){
               // if stack is empty push without thinking
               if(s.size()==0){
                   s.push(input.charAt(i));
               }
               // if stack is not empty and opening bracket pop it
               else if(s.size()!=0 && s.peek()=='{')
                   		s.pop();
               // if stack is not empty and  closing bracket then push it in to stack
               else
                   s.push(input.charAt(i));
           }
       }
       int count=0;
       while(!s.isEmpty()){
           char c1=s.pop();
           char c2=s.pop();
            //if both charecter are same then only one reversal required
           if(c1==c2)
               count++;
            //if both charecter are different then  two reversal required {} in this case we have to reverse both;
           else
               count=count+2;
       }
       return count;
		// Write your code here

	}
}