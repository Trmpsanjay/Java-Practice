/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        	int data;
	        Node next;
	        Node(int data)
	        {
		        this.data = data;
		        this.next = null;
	        }
	        
        }
        
*****************************************************************/

public class Solution 
{
	public static Node reverseLinkedList(Node head) 
	{
//         // Recursive solutuin
//         if(head==null || head.next == null)
//             return head;
       
//         Node reversed = reverseLinkedList(head.next);
//          Node temp = head.next;;
//         temp.next = head;
//         head.next = null;
       
//         return reversed;
        


//         // Fix the head pointer
//         return rest;
        
        
        // non recursive solution
        if(head == null || head.next == null)
            return head;
        Node curr = head;
        Node prev = null;
        Node temp ;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        return prev;
        
        
        
	}
}
