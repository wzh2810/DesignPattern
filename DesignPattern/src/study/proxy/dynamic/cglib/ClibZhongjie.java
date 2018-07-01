package study.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ClibZhongjie implements MethodInterceptor{
	
	public Object getInstance(Class clazz) throws Exception {
		
		Enhancer enhancer = new Enhancer();
		
		//把父类设置为谁？
		//这一步就是告诉cglib，生成的子类需要继承哪个类
		enhancer.setSuperclass(clazz);
		
		//设置回调
		enhancer.setCallback(this);
		
		//第一步、生成源代码
		//第二步、编译成class文件
		//第三步、加载到JVM中，并返回被代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
	
		System.out.println("我是中介：给你介绍房子");
		
		System.out.println("------------");
		
		//调用的时候
		method.invoke(obj, args);
		System.out.println("------------");
		System.out.println("找房结束");
		return null;
	}

}
