package adapter;

/**
 * 源类，也就是需要被适配的类
 */
public class Adaptee {
	/**
	 * 模拟源类中的方法
	 */
	public void SampleOperation1() {
		System.out.println("调用Adaptee类中的SampleOperation1方法");
	}
} 
