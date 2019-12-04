package Aufgabe1;

class List {
	Node head;

	// helper method to print a list
	public String toString() {
		StringBuffer buf = new StringBuffer();
		Node node = head;
		while (node != null) {
			buf.append(node.value);
			if (node.next != null) {
				buf.append(", ");
			}
			node = node.next;
		}
		return buf.toString();
	}
	
	// insert a string at the beginning of the list
	void insert(String value) {
		// insert your code here
	}
	
	// count strings
	int count() {
		// insert your code here
		return 0;
	}

	// get string at given index
	String get(int index) {
		// insert your code here
		return null;
	}
	
	// delete string
	void delete(String value) {
		// insert your code here
	}
}

