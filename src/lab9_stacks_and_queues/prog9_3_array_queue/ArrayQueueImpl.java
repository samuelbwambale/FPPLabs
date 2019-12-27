package lab9_stacks_and_queues.prog9_3_array_queue;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Array is empty");
		}
		return arr[front];
	}

	public void enqueue(int obj){
		//if its first element
		if(front == -1)
			front++;
		//if the array is full, resize
		if(isFull())
			resize();
		arr[rear++] = obj;
		System.out.println("Inserted: " + obj);
	}

	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Array is empty");
		}
		return arr[front++];
	}

	public boolean isEmpty() {
		return (front == -1 || front == rear);
	}

	public boolean isFull() {
		return rear == arr.length-1;
	}

	// size of the queue
	public int size() {
		if (isEmpty())
			return 0;
		return rear - front;
	}
	
	public void resize() {
		// implement
		int[] temp = new int[2 * arr.length];
//		temp = Arrays.copyOf(arr, 2 * arr.length);
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	
	public static void main(String[] args) throws Exception {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 10; i ++) {
			q.enqueue(i);
			System.out.println("front" + q.front);
			System.out.println("rear" + q.rear);
			
		}
			
		for(int i = 0; i < 10; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}

	
}

