package study.proxy.dynamic.jdk;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//JDK�Ķ�̬������ͨ���ӿ�������ǿ��ת����
		//�����Ժ�Ĵ�����󣬿���ǿ��ת��Ϊ�ӿ�
		Person obj = (Person) new Zhongjie().getInstance(new XiaoMing());
	
		System.out.println("main:" + obj.getClass());
		
		obj.find();
	}
}
