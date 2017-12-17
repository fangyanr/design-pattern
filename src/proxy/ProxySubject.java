package proxy;

/**
 * 代理主题
 */
public class ProxySubject extends Subject {
	// 关联真实主题
	private RealSubject realSubject;

	public void ProxySubject() {
	}

	// 覆盖抽象主题的方法，在对真实主题调用request方法的前后，加上了预处理和后处理
	public void request() {
		preRequest();
		if (realSubject == null) {
			realSubject = new RealSubject();
			realSubject.request();
		}
		postRequest();
	}

	private void preRequest() {
		System.out.println("调用代理主题的preRequest方法");
	}

	private void postRequest() {
		System.out.println("调用代理主题的postRequest方法");
	}
}
