package proxy;

/**
 * 客户端
 */
public class Client {
	static public void test(Subject subject) {
		subject.request();
	}

	public static void main(String[] args) {
		// 调用真实主题的request方法
		test(new RealSubject());

		System.out.println("----------------分割线---------------");

		// 调用代理主题的request方法
		test(new ProxySubject());
	}
}