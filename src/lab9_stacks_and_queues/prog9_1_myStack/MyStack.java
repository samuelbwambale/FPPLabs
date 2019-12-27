package lab9_stacks_and_queues.prog9_1_myStack;

public class MyStack {
	private MyStringLinkedList list;
	public MyStack() {
		list = new MyStringLinkedList();
	}
	
	// remove(0)
	public boolean pop() {
		return list.remove(0);
	}
	
	// get(0)
	public String peek() {
		return list.get(0);
	}
	
	// linked.addFirst(s)
	public void push(String s) {
		list.add(s);
	}
	
	public static void main(String[] args) {
	
		
		
		MyStack stack = new MyStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");

		
		System.out.println("Peeking...."+stack.peek());
		System.out.println("Popping..."+stack.pop());
		System.out.println("Peeking...."+stack.peek());
		System.out.println("Popping..."+stack.pop());
		System.out.println("Peeking...."+stack.peek());
	}
}
