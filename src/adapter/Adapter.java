package adapter;

/**
 * 适配器类Adapter，作用是把Adaptee变成Target 实现方法为：Adapter继承Adaptee，实现Target
 */         
public class Adapter extends Adaptee implements Target {
	/**
	 * 1)类形式的适配器
	 * 类形式的适配器——使用继承实现适配器模式(is a)
	 * 实现接口Target中的SampleOperation2方法 SampleOperation1方法直接使用Adaptee中的方法*/
	 
	@Override
	public void SampleOperation2() {
		System.out.println("调用Adapter类中的SampleOperation2方法");
	}
	
	
	/**
	 * 2)实例形式的适配器
	 * 实例形式的适配器——使用关联实现适配器模式(has a)
	 private Adaptee adaptee;

	  public Adapter(Adaptee adaptee) {
	      super();
	      this.adaptee = adaptee;
	  }

	  //直接调用Adaptee类中的SampleOperation1方法
	  public void SampleOperation1() {
	      adaptee.SampleOperation1();
	  }

	  public void SampleOperation2() {
	      System.out.println("调用Adapter类中的SampleOpertion2方法");
	  }*/
}
