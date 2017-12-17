package singleton;

public class EagerSingleton {
	// 饿汉式单例：声明并创建一个自身的static实例
	private static EagerSingleton instance = new EagerSingleton();

	// 构造方法是private
	private EagerSingleton() {
	}

	// 提供静态public方法，返回自己创建的唯一实例
	public static EagerSingleton getInstance() {
		return instance;
	}
}
