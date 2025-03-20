package collectionPgrms;

public class StackImpl_ArrayList {
	int size;
	int arr[];
	int top;
	
	public StackImpl_ArrayList(int size) {
		this.size= size;
		this.arr = new int[size];
		this.top=-1;
	}

	public Boolean isFull() {
		return(size-1==top); //return true if the stack is full ie.,if the top is at the last index of the arraylist
		
	}
	
	public Boolean isEmpty() {
		return(top==-1);//return true if the stack is empty i.e., if the top is pointing at the -1 index of the arryalist
		//(as top is initialized to -1 in constructor)
		
	}
	
	
	public int peek() {
		if(!this.isEmpty())
			return arr[top];
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void push (int element) {
		if(!this.isFull()) {
			top++;
			arr[top]=element;
			System.out.println("Pushed element "+element);
		}else
			System.out.println("Stack is full");
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element "+ arr[returnedTop]);
			return arr[returnedTop];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		StackImpl_ArrayList obj = new StackImpl_ArrayList(10);
		obj.push(5);
		obj.push(8);
		obj.push(11);
		
		obj.pop();
		
		
		
	}

}
