package g_oop2;

public abstract class Animal {
	void run(){
		System.out.println("달려간다~~");
	}
	
	abstract void sound();
	
}


class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹");
	}
}

class Snake extends Animal{

	@Override
	void sound() {
		System.out.println("츠츠츠");
	}
}

class Pikachu extends Animal{

	@Override
	void sound() {
		System.out.println("피카피카!");
	}
	void attack(){
		System.out.println("피카~~~츄!!");
	}
}