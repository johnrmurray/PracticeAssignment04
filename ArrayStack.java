package p04;

public class ArrayStack implements Stack {
	
	private int top;
	private Object[] a;
	
	public ArrayStack () {
		top = 0;
		a = new Object[10];
	}

	public void push(Object item) {
		if (top == a.length) {
			grow_stack();
		} else {
			a[top++] = item;
		}
		
	}

	public Object pop() {
		if (!empty()) {
			return a[--top];
		} else {
			return null;
		}
	}

	public Object peek() {
		if (!empty()) {
			return a[top-1];
		} else {
			return null;
		}
	}

	public boolean empty() {
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private void grow_stack() {
		Object[] new_a = new Object[a.length*2];
		for (int i=0; i < new_a.length; i++) {
			new_a[i] = a[i];
		}
		a = new_a;
//		System.arraycopy(a, 0, new_a, 0, a.length);
	}

}
