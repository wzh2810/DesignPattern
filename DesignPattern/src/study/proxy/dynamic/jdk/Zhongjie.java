package study.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Zhongjie implements InvocationHandler{
	
	private Person person;
	
	public Object getInstance(Person person) throws Exception {
		
		this.person = person;
		
		Class clazz = person.getClass();
		
		System.out.println("����������class��:"+clazz);
		
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("�����н飺������ܷ���");
	
		System.out.println("------------");
		
		//���õ�ʱ��
		method.invoke(this.person, args);
		System.out.println("------------");
		System.out.println("�ҷ�����");
		return null;
	}

}
