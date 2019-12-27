package lab9_stacks_and_queues.prog9_4_node_queue;

@SuppressWarnings("serial")
public class QueueException extends Exception {
	public QueueException() {
		super();
	}
	public QueueException(String msg) {
		super(msg);
	}
	public QueueException(Throwable t) { 
		super(t);
	}
}
