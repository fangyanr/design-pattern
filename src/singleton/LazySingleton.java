package singleton;

public class LazySingleton {
	// 懒汉式单例：只声明，不创建
	private static LazySingleton instance = null;

	// 构造方法为private
	private LazySingleton() {
	}

	// 当第一次调用getInstance方法时，创建唯一实例
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
