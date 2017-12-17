package decorator;

/**
 * 具体装饰器类，继承了Decorator装饰器类
 */
public class ConcreteDecorator extends Decorator {
	public ConcreteDecorator(Component component) {
		super(component);
	}

	public void SampleOperation() {
		super.SampleOperation();
		System.out.println("ConcreteDecorator具体装饰器类对SampleOperation方法进行了扩展");
	}
}
