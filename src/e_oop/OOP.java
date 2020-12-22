package e_oop;

import fun_fun.*;
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 *  - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 */
		
//		new SampleClass();
//		SampleClass sc = new SampleClass();
//		
//		System.out.println(sc.field);
//		
//		sc.method1();
//		int a = sc.field;
//		System.out.println(sc.method2(5));
//		String returnValue = sc.method2(a);
//		System.out.println(returnValue);
//		
//		sc.flowTest1();
		
//		Calculator
		//123456 + 654321
		Calculator cal = new Calculator();
		double a = 123456;
		double b = 654321;
		double sum = cal.sum(a, b);
		double times = cal.times((long)sum, a);
		double divide =cal.divide(times, a);
		double minus = cal.sub(divide, b);
		double rest = cal.rest(minus, a);
		System.out.println(a+" + "+ b + " = "+sum);
		System.out.println(sum + " * " + a + " = "+times);
		System.out.println(times + " / " + a + " = "+divide);
		System.out.println(divide + " - " + b + " = "+minus);
		System.out.println(rest);
		
		/*
		 * 어떤 대상을 잡아 클래스를 만들어주세요.
		 * 메서드의 내용은 구체적이지 않아도 괜찮습니다.
		 * 파라미터와 리턴타입 위주로 만들어주세요.
		 * 클래스에 메서드를 만들어보면 파라미터와 리턴타입을 생각해 보는것이 중요합니다.
		 * 만들어진 클래스를 main메서드에서 사용해주세요.
		 * 
		 */
		Lunch_total s = new Lunch_total();
		System.out.println(s.cal(112, 3500));
	}

}
