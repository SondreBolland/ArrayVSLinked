package INF102.h21.list;

<<<<<<< HEAD
=======

>>>>>>> 654da8170fa134d7580de05a00f219c1cd896f78
public class ArrayList<T> implements List<T> {

	
	public static final int DEFAULT_CAPACITY = 10;
	
	private int n;
	
	private Object elements[];
	
	public ArrayList() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	@Override
	public T get(int index) {
		// TODO: Implement method
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public void add(int index, T element) {
		// TODO: Implement method	
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public int size() {
		return n;
	}

	@Override
	public boolean isEmpty() {
		return n == 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(n*3 + 2);
		str.append("[");
		for (int i = 0; i < n; i++) {
			str.append((T) elements[i]);
			if (i != n-1)
				str.append(", ");
		}
		str.append("]");
		return str.toString();
	}

}
