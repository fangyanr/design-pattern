package proxy;

/**
 * 抽象主题角色，定义了真实主题和代理主题都要实现的方法
 */
public abstract class Subject {
	public abstract void request();
}
