package INF102.h21.list;

public interface List<T> {
	
	public int size();
	
	public boolean isEmpty();
		
	public T get(int index);
	
	public void add(int index, T element);
	
	public void add(T element);
}
