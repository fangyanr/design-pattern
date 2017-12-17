package decorator;

/**
 * 客户端，用不同的组件对象去调用方法
 */
public class Client {
	public static void main(String[] args) {
		// 创建组件对象component，调用SampleOperation方法
		Component component = new ConcreteComponent();
		component.SampleOperation();
		System.out.println("-----------------分割线----------------");

		// 使用Decorator装饰组件对象component，调用SampleOperation方法
		Component decorator = new Decorator(component);
		decorator.SampleOperation();
		System.out.println("-----------------分割线----------------");

		// 使用ConcreteDecorator装饰组件component，调用SampleOperation方法
		Component concreteComponent = new ConcreteDecorator(component);
		concreteComponent.SampleOperation();
		System.out.println("-----------------分割线----------------");
	}
}
