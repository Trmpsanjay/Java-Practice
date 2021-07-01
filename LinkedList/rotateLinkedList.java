
/***********************************************************
 
Following is the Linked list node structure already written 
 
class LinkedListNode<t> {
    public t data;
     public LinkedListNode<t> next;
     public LinkedListNode(t data)
     {
         this.data=data;
     }
}

**************************************************************/


public class Solution {

    
    public static LinkedListNode<Integer> rotate(LinkedListNode<Integer> head, int n) {

       
        int count = 1;
        LinkedListNode<Integer> temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        // make circular LL
        temp.next = head;
        n = n%count;
        n = count - n;
        LinkedListNode<Integer> prev = null;
        while(n-->0){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;

    }

}