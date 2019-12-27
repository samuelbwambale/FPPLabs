package lab9_stacks_and_queues.prog9_4_node_queue;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;

	/* stores the element at the end of the queue, if it exists */
	private Node tail;

	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		// implement
		if (s == null)
			return;
		Node newNode = new Node();
		newNode.data = s;
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
//			Node currentTail = tail;
//			currentTail.next = newNode;
//			tail = newNode;

			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	/**
	 * Removes node from the front of the queue and returns its value if head is n
	 */
	public String dequeue() throws QueueException {
		if (isEmpty())
			throw new QueueException("Queue is empty!");
		String value = head.data;
		head = head.next;
		return value;
	}

	/**
	 * Returns value stored at the front of the queue
	 * 
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if (isEmpty())
			throw new QueueException("Queue is empty!");
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		if (isEmpty())
			return "<empty queue>";
		return head.toString();
	}
}
