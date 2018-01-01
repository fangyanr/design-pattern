package strategy;

public class Dog implements Comparable {
	private int food;

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public Dog(int food) {
		super();
		this.food = food;
	}

	@Override
	public String toString() {
		return this.food + "";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Dog) {
			Dog d = (Dog) o;
			if (this.getFood() > d.getFood())
				return 1;
			else if (this.getFood() < d.getFood())
				return -1;
			return 0;
		}
		return -100;
	}

}
