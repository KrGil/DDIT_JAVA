package e_oop;

public class VariableInit {
	
	//명시적 초기화
	int var = 10;
	static int staticVar = 20;
	
	//블럭 사용 이유,, 이것을 이용 함으로 한번에 많은 것들을 해 줄 수 있어서 사용
	//초기화 블럭
	{
		var = 30;
	}
		//클래스변수 초기화(static 변수)
		static {
			staticVar = 20;
		}
	
	//생성자
	/*
	 * 생성자
	 * - 클래스와 같은 이름의 메서드
	 * - 인스턴스 변수(static이 없는)를 초기화하기 위해 사용한다.
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어 준다.
	 * - 생성자는 리턴타입이 없다.
	 */
		
	//return 타입이 없다.
	VariableInit(){
		var = 50;
//		staticVar = 60;
		//값을 공유해야 하는 클래스 변수가 객체 생성 시 마다 계속 초기화되기 때문에
		//클래스 변수를 생성자에게 초기화하는 것은 좋지 않다.
		
		//생성자 사용 이유
		//초기화에 여러줄의 코드가 필요할 때
		//초기화에 파라미터가 필요할 때
	}
	
	public static void main(String[] args){
		Init i = new Init();
		System.out.println(i.a+i.b);
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init(40,50,60);
		Init i3 = new Init(40,50,60);
		
		System.out.println(i2.b(i2.a()));
		System.out.println(i2.b(i2.a()));
	}
}

class Init{
	int a;
	int b;
	int c;
	static int sum;
	
	//메서드의 이름은 중복될 수 있다!!
	Init(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		//this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다.
		//자기자신 변수의 주소를 저장하고 있다.
	}
	
	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	Init(){
//		a = 10;
//		b = 20;
//		c = 30;
		//this 위에는 코드가 있으면 안됨.
		this(10,20,30);
		//간접적으로 초기화 해주기
		//this() : 생성자에서 다른 생성자를 호출할 때 사용한다. -- 간단하게 하기위해서.
	}
	
	int a(){
		return a+b+c;
	}
	int b(int a){
		return sum += a;
	}
}

