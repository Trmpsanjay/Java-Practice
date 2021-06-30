import java.util.*;
public class Solution {

	public static int[] stockSpan(int[] price) {
        Stack<Integer> index = new Stack<>();
        int i=0;
        int peek=0;
        int arr[]=new int[price.length];
        while(i<price.length){
           if(index.empty()){
               index.push(i);
               arr[i]=1;
           }else{
               peek=index.peek();
               if(price[peek]>=price[i]){
                  index.push(i);
                  arr[i]=1;
               }else{
                  peek=index.peek(); 
                  while(price[peek]<price[i]&&((!(index.empty()))&&price[peek]!=price[i])){
                      index.pop();
                      if(!(index.empty())){
                      peek=index.peek();
                      }
                  }
                    if(index.empty()){
                        arr[i]=i+1 ;
                    }
                    else
                   {
                      arr[i]=i-index.peek();
                    }
            // Push this element to stack 
            index.push(i); 
               }
           }
          i++;
        }
        return arr;
	}
}