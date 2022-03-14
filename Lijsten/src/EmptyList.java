
public class EmptyList extends List {
	
	public EmptyList() {}
	
	public int getLength() {
		return 0;
	}
	
	@Override
	public String toString() {
		String string = "[]";
		return string;
	}
	
	@Override
	public boolean equals(Object other) {
		return other instanceof EmptyList;
	}


}
