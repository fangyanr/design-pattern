package singleton;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		// 获得多个实例，输出后如果地址相同，说明是同一个实例
		EagerSingleton eager1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();
		System.out.println(eager1);
		System.out.println(eager2);
		System.out.println("--------------------");
		LazySingleton lazy1 = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();
		System.out.println(lazy1);
		System.out.println(lazy2);
		System.out.println("--------------------");
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		try {
			r1.exec("calc.exe");// 打开计算机
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
