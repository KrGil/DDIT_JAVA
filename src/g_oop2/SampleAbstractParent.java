package g_oop2;

public abstract class SampleAbstractParent {
	
	void method(){
		
	}
	
	//추상매서드? 선언부만 있고 내용이 없음.
	//추상메서드가 단 하나라도 있으면 클래스도 추상매서드라는걸 표시해줘야함(abstract)
	//추상메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
	//부모 클래스의 역할을 하기 위해서 만듬
}
class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		System.out.println("추상메서드를 상속받아 내용을 만들어줌");
		
	}
	
	
}