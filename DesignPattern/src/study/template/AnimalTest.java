package study.template;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		
		animal1.play();
		
		System.out.println("-------------");
		
		Animal animal2 = new Cat();
		
		animal2.play();
	}
}
