package study.proxy.sta;

import org.junit.Test;

public class StaticProxy {

	public interface Animal {
		
		void display();
	}
	
	public class Cat implements Animal {

		@Override
		public void display() {
			
			System.out.println("ß÷ß÷~~~~");
			
		}
	}
	
	public class CatProxy implements Animal {
		
		private Animal animal;
		
		public CatProxy(Animal animal) {
			
			this.animal = animal;
		}
		
		@Override
		public void display() {
			
			System.out.println("----¿ªÊ¼-----");
			
			animal.display();
			
			System.out.println("----½áÊø-----");
			
		}
	}
	
	@Test
	public void test() {
		
		Cat cat = new Cat();
		
		CatProxy proxy = new CatProxy(cat);
		
		proxy.display();
	}
	
	
}
