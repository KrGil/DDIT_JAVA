package g_oop2;

public interface SampleInterface {
	
	//상수와 추상메서드만 가질수 있다.
	//인터페이스의 모든 맴버변수는 public static final 제어자를 사용해야 한다.
	public static final int num1 = 1;
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int num2 = 2;

	
	//인터페이스의 모든 메서드는  public abstract 제어자를 사용해야 한다.
	public abstract void method1();
	//모든 메스드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
}

class SampleImlements implements SampleInterface, SampleInterface2{
	//인터페이스는 클래스와 달리 여러개의 인터페이스로부터 상속 받을 수 있다.
	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}

	@Override
	public void method3() {
	}
}

interface SampleInterface2{
	int a = 2;
	void method1();
	void method3();
}

