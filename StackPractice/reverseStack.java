import java.util.Stack;

public class Solution {
//     private static Stack<Integer> reverse(Stack<Integer> s1, Stack<Integer> s2){
//         if(s1.isEmpty())
//             return s2;
//         int num = s1.pop();
//         s2.push(num);
//        	return reverse(s1,s2);
        
//     }

// 	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
        
//         // with the help of extra stack
        
//        	s2 = reverse(s1,s2);
//        	Stack<Integer> s3 =   new Stack<>();
//        	s3 = reverse(s2,s3);
//        	s1 = reverse(s3,s1);
        
        
		
// 	}
    
    
    //WITHOUT EXTRA SPACE
    
    
    private static void reverse(Stack<Integer> s1, Stack<Integer> s2){
        if(s1.size()==0){
            return;
            }
        int s=s1.pop();
        reverse(s1,s2);
         s2.push(s);
    }

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
        while(s1.size()!=0){
            int s=s1.pop();
            s2.push(s);
        }
        // System.out.println(s1.size());
        reverse(s2,s1);
    }
    
    
    
}