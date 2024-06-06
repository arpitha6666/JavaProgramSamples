package collections;

public class QueueImpl_ArrayList {
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	public QueueImpl_ArrayList(int size){
		this.capacity=size;
		front =0;
		rear=-1;
		queueArr = new int[this.capacity];
	}
	
	public boolean isFull() {
		if(currentSize == capacity) 
			return true;
		else 
			return false;
	}
	
	public boolean isEmpty() {
		if(currentSize ==0)
			return true;
		else 
			return false;
	}
	
	public void enqueue(int data) {
		if( isFull())
			System.out.println("Queue is full, cannot insert data");
		else
		{
			rear++;
			if(rear == capacity-1)
				rear=0;
			queueArr[rear]=data;
			currentSize++;
			System.out.println(data + " Added to queue");
		}
	}
	
	public void dequeue() {
		if(isEmpty())
			System.out.println("Queue is empty, cannot delete element");
		else {
			front++;
			if(front ==capacity-1) {
				System.out.println(queueArr[front-1]+ " removed from the queue");
				front =0;
			}else{
				System.out.println(queueArr[front-1]+ " removed from queue");
			}
			currentSize--;	
		}
	}
	
	public static void main(String[] args) {
		
		QueueImpl_ArrayList obj = new QueueImpl_ArrayList(5);	
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.dequeue();

	}
}
