package iterator;

public class Test {
	public static void main(String[] args) {
		// ArrayList al = new ArrayList();
		// LinkedList ll=new LinkedList();
		// Collection c = new ArrayList();
		Collection c = new LinkedList();
		for (int i = 0; i < 15; i++) {
			//c.add(new Cat(i));
		}
		System.out.println(c.size());

		// ArrayList al = (ArrayList) c;
		// for (int i = 0; i < al.size(); i++) {
		// System.out.println(i);
		// }
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
