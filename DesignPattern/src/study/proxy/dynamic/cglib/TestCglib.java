package study.proxy.dynamic.cglib;

import org.junit.Test;

public class TestCglib {

	@Test
	public void test() throws Exception {
		
		//CGLib�Ķ�̬������ͨ������һ���������������࣬Ȼ����д����ķ���
		//�����Ժ�Ķ��󣬿���ǿ��ת��Ϊ���������Ҳ�������Լ�д���ࣩ
		//�������ø�ֵ������
				
		Xiaoli obj = (Xiaoli) new ClibZhongjie().getInstance(Xiaoli.class);
		
		obj.find();
	}
}
