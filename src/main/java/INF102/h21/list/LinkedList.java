package INF102.h21.list;

public class LinkedList<T> implements List<T> {

	private int n;

	private Node<T> head;

	@Override
	public int size() {
		return n;
	}

	@Override
	public boolean isEmpty() {
		return n == 0;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index > n-1)
			throw new IndexOutOfBoundsException("Index:" + index + " is out of bounds. The list has " + n + " n elements.");
		
		Node<T> currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.data;
	}

	@Override
	public void add(int index, T element) {
		if (index < 0 || index > n-1)
			throw new IndexOutOfBoundsException("Index:" + index + " is out of bounds. The list has " + n + " n elements.");
		
		if (index == 0) {
			Node<T> newNode = new Node<>(element);
			newNode.next = head;
			head = newNode;
			n++;
			return;
		}
		
		Node<T> currentNode = head;
		for (int i = 0; i < index-1; i++) {
			currentNode = currentNode.next;
		}
		Node<T> newNode = new Node<T>(element);
		Node<T> temp = currentNode.next;
		currentNode.next = newNode;
		newNode.next = temp;
		n++;
	}

	@Override
	public void add(T element) {
		Node<T> newNode = new Node<T>(element);
		if (head == null) {
			head = newNode;
			n++;
			return;
		}
		
		Node<T> currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		n++;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(n*3 + 2);
		str.append("[");
		Node<T> currentNode = head;
		while (currentNode.next != null) {
			str.append((T) currentNode.data);
			str.append(", ");
			currentNode = currentNode.next;
		}
		str.append((T) currentNode.data);
		str.append("]");
		return str.toString();
	}

	@SuppressWarnings("hiding")
	private class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}
	
}
