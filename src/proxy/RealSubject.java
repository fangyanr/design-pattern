package proxy;

/**
 * 真实主题
 */
public class RealSubject extends Subject {
	public RealSubject() {
	}

	public void request() {
		System.out.println("调用真实主题的request方法");
	}
}
