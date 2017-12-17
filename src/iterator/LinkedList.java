package iterator;

public class LinkedList implements Collection {
	Node head = null; // 头元素
	Node tail = null; // 尾元素
	int size = 0;

	public void add(Object o) {
		Node n = new Node(o, null);
		if (head == null) {
			head = n;
			tail = n;
		}
		tail.setNext(n);
		tail = n;
		size++;
	}

	public int size() {
		return size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator {
		boolean hasNext = true;
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode == null) {
				currentNode = head;
			} else {
				currentNode = currentNode.getNext();
			}
			if (currentNode == null || currentNode.getNext() == null) {
				hasNext = false;
			}

			return currentNode.getData();
		}

		@Override
		public boolean hasNext() {
			if (head == null) {
				return false;
			}
			return hasNext;
		}
	}
}
