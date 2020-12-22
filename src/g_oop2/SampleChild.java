package g_oop2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleChild extends SampleParent {
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);//상속받은 변수
		System.out.println(method(7,13)); //상속받은 메서드
		
	}
	
	//상속의 개념
	//오버라이딩 - 안의 내용을 바꿈.
	//super, super() - (this와 용도가 비슷하다. this는 메서드와 파라미터
	//					super는 부모와 자식.super()는 부모클래스의 생성자 호출
	//다형성
	
	//오버라이딩  : 상속받은 메서드의 내용을 재정의 하는 것.
	@Override // 어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것. 어떤 식으로 사용되는 거다.
	int method(int a, int b){ // 리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a*b;
	}
	
	//super, super()
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); // 인스턴스 변수
		System.out.println(super.var); // 부모 클래스의 인스턴스 변수
		// super : 부모 클래스의 맴버와 자식 클래스의 맴버(변수와 메서드)가
		//			이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	
	SampleChild(){//생성자는 변수를 초기화 해주기 위해... 누적될 수도 있으니까 다른 개체 생성하면 기본값을 주려고?
				  //상속받은 변수도 초기화 해야하기 때문에!!
		
		//가장 첫줄에 있어야함. 생성자 받아오는 this();와 마찬가지...
		super(); // 부모클래스의 생성자 호출
		//super()를 통해 클래스의 생성자를 호출하고 부모 클래스의 인스턴스 변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
	//다형성
	public static void main(String[] args){
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild(); //타입이 서로 다르다
		//SampleChild2
		//sp = new SampleChild2();
		
		//SampleChild3
		//sp = new SampleChild3();
		
		//부모타입의 변수로 자식타입의 객체를 사용하는 것이 다형성이다.
		
		//부모와 자식간에는 서로 형변환이 가능하다.
		sc = (SampleChild)sp;//
		sp = (SampleParent)sc;//생략이 가능하다. ?
		//자식타입 -> 부모타입 형변환은 생략할 수 있다.
		
		//자주 쓰이는지 :많이 사용, 어떨때 쓰이는지 질문 컬렉션등..으로
		SampleChild sc2 = (SampleChild)new SampleParent();
//		SampleChild sc3 = new SampleParent(); 오류발생!!
		//SampleParent는 2개의 맴버를 가지고 있다.
		//SampleChild는 5개의 맴버를 가지고 있다.
		//SampleChild 타입의 변수는 5개의 맴버를 사용할 수 있어야 하는데
		//SampleParent 객체는 2개의 맴버만 가지고 있다.
		//그러므로 부모타입의 객체를 자식타입으로 형변환 하는것은 에러를 발생시킨다.
		
		//SampleParent 타입의 변수로는
		//SampleChild 객체를 가지고도 2개의 맴버만 사용할 수 있다.
		sp = sc;//(SampleParent)
		//2      5 객체 생성은 왼쪽을 오른쪽이 포용할 수 있냐로 생각.
		System.out.println(sp.var);
		System.out.println(sp.method(10,20));
		
		
		//ex)
		List list = new ArrayList();
//		list = new LinkedList();
		//앞의 class 타입까지 바꿀 필요가 없으니까 이렇게 쓴다. 확장성?범용성?이 좋아서
		
		ArrayList list1 = new ArrayList();
		//List가 부모 ArrayList가 자식
	}
}
