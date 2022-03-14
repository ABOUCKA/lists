
public class NonEmptyList extends List {
	private int head;
	private int[] tail;
	
	public NonEmptyList(int head, int[] tail) {
		this.head = head;
		this.tail = tail;
	}
	
	@Override
	public boolean equals(Object object) {
		
		return object instanceof NonEmptyList nonemptylist && head == nonemptylist.head 
				&& tail == nonemptylist.tail; 
		
	}
	
	@Override
	public String toString() {
		String string = "[" + head;
		for(int i=0; i < tail.length; i++) {
			string = string + ", " + tail[i];
		}
		return string + "]";
		
	}
	
	public int length() {
		int length = 1;
		for(int element: tail) {
			length = length + 1;
		}
		return length;
	}
	
	public int getHead() {
		return head;
	}
	
	public String getTail() {
		String string = "[" + tail[0];
		for(int i=1; i < tail.length; i++) {
			string = string + ", " + tail[i];
		}
		return string + "]";
	}

}
