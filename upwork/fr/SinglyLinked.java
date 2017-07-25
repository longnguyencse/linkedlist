package upwork.fr;

public class SinglyLinked extends LinkedList {
	private Node head;
	private int size;

	public SinglyLinked() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public void append(int data) {
		add(data, size);
	}

	@Override
	public void removetail() {
		remove(size);
	}

	@Override
	public void removeEleGreaterThanVale(int threshold) {
		Node current = head;
		for (int i = 0; i < size; i ++) {
			if (null != current && current.getData() > threshold) {
				remove(i);
			}
		}
	}

	@Override
	protected void add(int data, int index) throws IndexOutOfBoundsException{
		if (index > size) {
			throw new IndexOutOfBoundsException("Index Out Of Bound Ecxeption");
		}
		
		Node temp = new Node(data);
	    Node current = head;

	    if (index == 0){
	        temp.setNext(head);
	        this.head = temp;
	    } else{
	        for(int i = 1; i < index; i++){
	        	current = current.getNext();
	        }
	        temp.setNext(current.getNext());
	        current.setNext(temp);
	    }

	    this.size++;
	}

	@Override
	protected void remove(int index) throws IndexOutOfBoundsException{
		if (index > size) {
			throw new IndexOutOfBoundsException("Index Out Of Bound Ecxeption");
		}
		
		Node current = head;

		if (index == 0) {
			head = head.getNext();
		} else {
			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}

		this.size--;
	}

	@Override
	protected void add(int data) {
		add(data, size);
	}

}
