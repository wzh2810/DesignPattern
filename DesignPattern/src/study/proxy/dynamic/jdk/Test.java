package study.proxy.dynamic.jdk;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//JDK的动态代理是通过接口来进行强制转换的
		//生成以后的代理对象，可以强制转换为接口
		Person obj = (Person) new Zhongjie().getInstance(new XiaoMing());
	
		System.out.println("main:" + obj.getClass());
		
		obj.find();
	}
}
