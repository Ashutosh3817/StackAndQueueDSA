package StackAndQueuesDSA450plus;

public class Queue {
	int size , front, rear;
	int capacity;
	int[] array;
	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size=0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	
	//Queue is full when size becomes equal the capacity
	public  boolean isFull(Queue queue) {
		return(queue.size == queue.capacity);
	}
	public boolean isEmpty(Queue queue) {
		return(queue.size==0);
	}
	//method to add an item in the queue
	public void enqueue(int item) {
		if(isFull(this)) return ;
		
		this.rear = (this.rear+1) % this.capacity;
		
		this.array[this.rear] = item;
		this.size = this.size +1;
		System.out.println(item + " enqueued to queue");
	}
	//method to remove an item in queue
	public int dequeue() {
		if(isEmpty(this)) return Integer.MIN_VALUE;
		
		int item = this.array[this.front];
		this.front = (this.front+1)% this.capacity;
		this.size = this.size-1;
		return item;
	}
	
	//method to get front of the queue
	public int front() {
		if(isEmpty(this)) return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	public int rear() {
		if(isEmpty(this)) return Integer.MIN_VALUE;
		
		return this.array[this.rear];
		
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(57);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.dequeue() + " dequeued from queue \n");
		
		System.out.println("Front Item Is : " + queue.front);
		System.out.println("Rear Item Is :" + queue.rear);
		
	}
}
