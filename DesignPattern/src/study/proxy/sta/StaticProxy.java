package study.proxy.sta;

import org.junit.Test;

public class StaticProxy {

	public interface Animal {
		
		void display();
	}
	
	public class Cat implements Animal {

		@Override
		public void display() {
			
			System.out.println("����~~~~");
			
		}
	}
	
	public class CatProxy implements Animal {
		
		private Animal animal;
		
		public CatProxy(Animal animal) {
			
			this.animal = animal;
		}
		
		@Override
		public void display() {
			
			System.out.println("----��ʼ-----");
			
			animal.display();
			
			System.out.println("----����-----");
			
		}
	}
	
	@Test
	public void test() {
		
		Cat cat = new Cat();
		
		CatProxy proxy = new CatProxy(cat);
		
		proxy.display();
	}
	
	
}
