package p04;

public class ArrayQueue implements Queue {
	
	private int head;
	private int tail;
	private Object[] a;

	public ArrayQueue() {
		head = 0;
		tail = 0;
		a = new Object[10];
	}
	public Object dequeue() {
		if (empty()) {
			return null;
		}
		
		Object item = a[head];
		head++;

		return item;
	}

	public void enqueue(Object item) {
		if (full()==true) {
			System.out.println("what");
			grow_queue();
		} else {
			a[tail] = item;
			tail++;

		}
		
	}

	public boolean empty() {
		if (head == tail) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean full() {
		if ((tail+1) % a.length == head) {
			return true;
		} else {
			return false;
		}
	}
	
	private void grow_queue() {
		Object[] new_a = new Object[a.length*2];
		for (int i=0; i < new_a.length; i++) {
			System.out.println("hello");
			new_a[i] = a[i];
		}
		a = new_a;
	}

	
} 
