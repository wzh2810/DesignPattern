package study.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ClibZhongjie implements MethodInterceptor{
	
	public Object getInstance(Class clazz) throws Exception {
		
		Enhancer enhancer = new Enhancer();
		
		//�Ѹ�������Ϊ˭��
		//��һ�����Ǹ���cglib�����ɵ�������Ҫ�̳��ĸ���
		enhancer.setSuperclass(clazz);
		
		//���ûص�
		enhancer.setCallback(this);
		
		//��һ��������Դ����
		//�ڶ����������class�ļ�
		//�����������ص�JVM�У������ر��������
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
	
		System.out.println("�����н飺������ܷ���");
		
		System.out.println("------------");
		
		//���õ�ʱ��
		method.invoke(obj, args);
		System.out.println("------------");
		System.out.println("�ҷ�����");
		return null;
	}

}
