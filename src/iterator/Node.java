package iterator;

public class Node {
	private Object data;       //LinkedList集合的每一个元素中的对象数据
	private Node next;         //LinkedList集合的每一个元素中指向下一个元素

	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
