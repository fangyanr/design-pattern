package iterator;

public class ArrayList implements Collection {
	Object[] objects = new Object[10];//旧数组初始化长度为10
	int index = 0;

	public void add(Object o) {
		if (index == objects.length) {
			Object[] newObject = new Object[objects.length * 2];//新数组长度为旧数组长度2倍
			System.arraycopy(objects, 0, newObject, 0, objects.length);
			objects = newObject;//旧数组指向新数组
		}
		objects[index] = o;//旧数组现在是新数组的长度
		index++;
	}

	public int size() {
		return index;
	}

	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}

	private class ArrayListIterator implements Iterator {
		private int currentIndex = 0;

		@Override
		public Object next() {
			Object o = objects[currentIndex];
			currentIndex++;
			return o;
		}

		@Override
		public boolean hasNext() {
			if (currentIndex >= index)
				return false;
			else
				return true;
		}
	}
}
