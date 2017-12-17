package decorator;

/**
 * 具体组件类，功能将被动态扩展
 */
public class ConcreteComponent implements Component {
	public void SampleOperation() {
		System.out.println("调用ConcreteComponent具体组件类中的SampleOperation方法");
	}
}