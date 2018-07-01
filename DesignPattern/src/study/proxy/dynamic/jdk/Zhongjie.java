package study.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Zhongjie implements InvocationHandler{
	
	private Person person;
	
	public Object getInstance(Person person) throws Exception {
		
		this.person = person;
		
		Class clazz = person.getClass();
		
		System.out.println("被代理对象的class是:"+clazz);
		
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("我是中介：给你介绍房子");
	
		System.out.println("------------");
		
		//调用的时候
		method.invoke(this.person, args);
		System.out.println("------------");
		System.out.println("找房结束");
		return null;
	}

}
