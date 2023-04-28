package canteenproject.collections;

import java.util.function.Function;

public interface Collection<A> {
	public void add(A element);
	public void remove(A element);
	public boolean contains(A element);
	public boolean isEmpty();
	public int size();
	
	public <R> void map(Function<A, R> function);
}
