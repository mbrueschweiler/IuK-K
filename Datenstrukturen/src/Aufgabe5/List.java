package Aufgabe5;

class List {
	private Node head;
	private Node tail;
	
	// insert an element at the beginning
	public void insert(Object o) {
		Node node = new Node();
		node.obj = o;
		if (head == null) {
			head = node;
			tail = node;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
		}
	}
	
	// insert an element at the end
	public void append(Object o) {
		Node node = new Node();
		node.obj = o;
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	// delete an element
	public void delete(Object o) {
		Node node = find(o);
		if (node != null) {
			delete(node);
		}
	}
	
	private void delete(Node node) {
		if (head == node) {
			head = node.next;
		}else {
			node.prev.next = node.next;
		}
		if (tail == node) {
			tail = node.prev;
		} else {
			node.next.prev = node.prev;
		}
	}
	
	private Node find(Object o) {
		Node node = head;
		while (node != null) {
			if (node.obj == o) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		Node node = head;
		while (node != null) {
			buf.append(node.obj.toString());
			if (node.next != null) {
				buf.append(", ");
			}
			node = node.next;
		}
		return buf.toString();
	}
	
	boolean checkLinks() {
		Node node = head;
		Node prevNode = null;
		while (node != null) {
			if (node.prev != prevNode) {
				return false;
			}
			prevNode = node;
			node = node.next;
		}
		if (prevNode != tail) {
			return false;
		}
		return true;
	}
}

