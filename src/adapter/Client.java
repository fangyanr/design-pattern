package adapter;

//测试类
public class Client {
public static void request(Target t) {
    t.SampleOperation1();
    t.SampleOperation2();
}

public static void main(String[] args) {
    request(new Adapter());
    //调用Adaptee类中的SampleOperation1方法
    //调用Adapter类中的SampleOperation2方法
}
}
