package study.template;

public abstract class Animal {

	abstract void eat();
	
	abstract void sleep();
	
	public final void play() {
		
		eat();
		
		sleep();
	}
}
