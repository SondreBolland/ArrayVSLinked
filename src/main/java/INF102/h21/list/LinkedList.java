package INF102.h21.list;

public class LinkedList<T> implements List<T> {

	private int n;
	
	/**
	 * If list is empty, head == null
	 * else head is the first element of the list.
	 */
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
		return getNode(index).data;
	}

	@Override
	public void add(int index, T element) {
		// TODO: Implement method
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	private Node<T> getNode(int index) {
		// TODO: Implement method
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(n*3 + 2);
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
