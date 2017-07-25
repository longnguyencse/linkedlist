package upwork.fr;

public abstract class LinkedList {
	public abstract void append(int data);
	public abstract void removetail();
	public abstract void removeEleGreaterThanVale(int threshold);
	
	protected abstract void add(int data);
	protected abstract void add(int data, int index) throws IndexOutOfBoundsException;
	protected abstract void remove(int index) throws IndexOutOfBoundsException;
}
