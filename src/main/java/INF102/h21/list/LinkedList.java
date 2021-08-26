package INF102.h21.list;

public class LinkedList<T> implements List<T> {

	private int size;
	
	/**
	 * If list is empty, head == null
	 * else head is the first element of the list.
	 */
	private Node<T> head;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T get(int index) {
		return getNode(index).data;
	}

	@Override
	public void add(int index, T element) {
		Node<T> newNode = new Node<T>(element);

		if (index == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node<T> currentNode = getNode(index-1);
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		size++;
	}

	private Node<T> getNode(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + " is out of bounds. The list has " + size + " n elements.");

		Node<T> currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(size*3 + 2);
		str.append("[");
		Node<T> currentNode = head;
		while (currentNode.next != null) {
			str.append(currentNode.data);
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
