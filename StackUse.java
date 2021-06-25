import java.util.Scanner;

class Stack {
	private int top = -1;
	int arr [];
	
	
	public Stack(int size){
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void delete() {
		if(isEmpty())
			return;
		top--;
	}
	
	public int size() {
		return arr.length;
	}
	public int top() {
		if(isEmpty()) 
			return -1;
		return arr[top];
		
	}

	public void insert(int data) {
		if(top==arr.length-1) {
			System.out.println("Stack is full");
			return;
		}
		arr[++top] = data;
		System.out.println(data+" inserted succesfully");
	}

	public void display() {
		if(isEmpty())
			System.out.println("Stack is empty");
		for(int i =0;i<=top;i++)
			System.out.println(arr[i]+" ");
		System.out.println();
	}
}







public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack");
		int n = sc.nextInt();
		Stack stack = new Stack(n);
		
		
		while(true) {
			System.out.println("To terminate program press ctrl+c");
			System.out.println("Please choose correct option");
			System.out.println("1: Display");
			System.out.println("2: Insert");
			System.out.println("3: Delete");
			System.out.println("4: Top");
			System.out.println("5: Size");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("");
					stack.display();
					break;
			case 2: System.out.println("Enter data to insert");
			        int data = sc.nextInt();
			        stack.insert(data);
			        stack.display();
			        break;
			case 3: 
					if(stack.isEmpty()) {
						System.out.println("Stack is empty");
						break;
					}
					stack.delete();
					System.out.println("Deleted succesfully");
					stack.display();
					break;
			case 4: System.out.println(stack.top());
					break;
			case 5: System.out.println(stack.size());
					break;

				default:
					break;
			}
		}

	}

}
