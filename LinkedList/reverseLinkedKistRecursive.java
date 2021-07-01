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
        if(head==null || head.next == null)
            return head;
        Node temp = head.next;
        Node reversed = reverseLinkedList(head.next);
        head.next = null;
        temp.next = head;
        return reversed;
	}
}
