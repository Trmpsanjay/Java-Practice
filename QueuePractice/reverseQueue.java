import java.util.Stack;
import java.util.Queue;

public class Solution {
 
	public static void reverseQueue(Queue<Integer> q) {
		if(q.size()==0)
            return;
        int num = q.remove();
        reverseQueue(q);
        q.add(num);
		
	}
}