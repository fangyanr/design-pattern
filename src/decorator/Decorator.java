package decorator;

/**
 * 装饰器类，实现了Component接口，同时关联了Component
 */
public class Decorator implements Component {
	private Component component;

	public Decorator(Component com) {
		this.component = com;
	}

	public void SampleOperation() {
		System.out.println("Decorator装饰器类对SampleOperation方法进行了扩展");
		component.SampleOperation();
	}
}