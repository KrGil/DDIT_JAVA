package a_variable; //클래스의 위치.

import java.util.Scanner;

public class Variable {// 클래스: 변수와 메서드로 구성
	public static void main(String[] args) { //메서드 - ()가 붙은것
		// TODO Auto-generated method stub
		//메서드 : 명령문의 집합
		//main메서드 : 프로그램의 시작과 끝
		
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
		{//		한줄 주석 : Ctrl + Shift + c OR Ctrl + /
//		한줄 주석 : Ctrl + Shift + c OR Ctrl + 
		
/*		범위주석 : Ctrl +  Shift + /(해제 : \)*/
		/*범위주석
		범위주석*/
		
//		데이터의 형태(데이터타입)와 이름을 작성하면 변수를 만들 수 있다.
//		데이터 타입을 선택할 때는 표현하고자 하는 데이터에 맞는 타입을 선택해 주면 된다.
//		변수이름을 정할 때는 표현하고자 하는 데이터의 의미와 부합하는 이름을 지어주면 된다.
		
		/*
		기본형 타입
		- 정수: byte(1), short(2), *int(4), long(8)
		- 실수: float(4), *double(8)
		- 문자: char(2)
		- 논리: boolean(1)
		*/
		
		//선언  및 초기화
		int x; //정수를 저장할 수 있는 x라는 이름을 가진 그릇을 만들어라.
		//변수를 만드는 것을 변수 선언이라고 표현한다.
//		doble x; //블럭{}안에서 이름이 중복될 수 없다.
		double y;

//		=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; //초기화 : 변수에 처음으로 값을 지정하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
		long l = 40L; // 접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; // 접미사 f를 붙여야  float타입이 된다.
		char c = '한'; // 따옴표안에 반드시 한글자를 넣어야 한다.
		boolean b = true; //true, false
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		int q = 1;
		boolean w = false;
		char e = 't';
		byte r = 0;
		short t = 0;
		long s = 10;
		float d = 1.1f;
		double z = 1.1;
		
//		변수의 값을 변경하기 위해서는 대입연산자를 사용해 변수에 새로운 값을 대입해주면 된다.
		x = 20; //기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
//		int x = 20; //변수를 만들때만 타입을 붙인다. 변수를 사용하기 위해서는 이름만 있으면 된다.
		y = 5.5;
		//위에서 만든 8개의 변수에 새로운 값을 저장해 주세요.
		q =2;
		w = true;
		e = 'ㅅ';
		r = 10;
		t = 20;
		s = 30;
		d = 2.2f;
		z = 3.3;
		
		//콘솔창에 출력
		System.out.println(100);
		//실행키 : Ctrl + F11
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		System.out.println(r);
		System.out.println(t);
		System.out.println(s);
		System.out.println(d);
		System.out.println(z);
		}
		System.out.print("dkdkdk");
		System.out.print("dkdkdk");
		System.out.print("dkdkdk");
		//문자열
		{String str = "문자 여러개.."; //클래스는 참조형타입 데이터이다.
		System.out.println(str);
//		문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
		System.out.print(str+50);
		System.out.print(10+20+str+50);
		System.out.print(str+50+10);
		}
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환이라 한다.
		{int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = (long)small; // 표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
		}
		
		/* 명명 규칙		
			-영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
			- 숫자로 시작할 수 없다.
			- 예약어는 사용할 수 없다.
			- [낙타식 표기법을 사용한다.(mySampleVariable)]
			- [클래스명의 첫글자는 대문자로 한다.(MySampleClass)]
		*/
		
		/* 상수
			- 값을 변경 할 수 없는 그릇
			- 리터럴에 의미를 부여하기 위해 사용한다.
		*/
		final int MAX_NUMBER = 10;
//		MAX_NUMBER = 20; //컴파일 에러 발생
		
		//출력
		{
		String stra = "aaaaa";
		String stra2 = "abb";
		System.out.print("줄바꿈을 하지 않는다.");
		System.out.println("줄바꿈을 한다.");
		System.out.print("줄바\t꿈을 하지 \n않는다.\n");
		System.out.printf("문자열: %s, 숫자 : %d\n", stra2, 10); //출력 포맷을 지정한다.
		}
		
		//입력
		
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		{
		//import 단축키 : Ctrl + Shift + o
//		System.out.print("아무거나 입력해주세요>");
//		String str2 = sc.nextLine();
//		System.out.print(str2);
		
//		System.out.print("int 입력 >");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!!");
		
//		System.out.print("input int >");
//		Integer int1 = Integer.parseInt(sc.nextLine());
//		System.out.print(int1);
//		
		}
		// 자신의 이름을 저장할 변수를 선언해주세요.
		String my_name;
		{
		// 위에서 선언한 변수를 초기화하기 위해 이름을 입력받아주세요.
		System.out.print("input your name > ");
		my_name = sc.nextLine();
		System.out.printf("my name is %s \n",my_name);
		
		//자신의 나이를 저장할 변수를 선언해주세요.
		int my_age;
		System.out.print("input your age > ");
		my_age = Integer.parseInt(sc.nextLine());
		System.out.printf("my age is %d\n",my_age);
		System.out.println("name : "+ my_name + "  -- age : " + my_age + "\n");
		}
		// 다음과 같은 프로그램을 작성해 주세요.
		/*=================회원가입====================
			아이디 > admin
			비밀번호(4자리숫자) > 1234
			이름 > 홍길동
			나이 > 30
			키 > 185.5
		==============================================
			아이디 : admin
			비밀번호(4자리숫자) : 1234
			이름 : 홍길동
			나이 : 30
			키 : 185.5
		 */sc.close();
	}

}
