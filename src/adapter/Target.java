package adapter;

/**
 * Target是目标类，也就是需要使用的类型
 */
public interface Target {

	/**
	 * 该方法与源Adaptee中的方法相同
	 */
	void SampleOperation1();

	/**
	 * 该方法是目标类中的新方法
	 */
	void SampleOperation2();
}
