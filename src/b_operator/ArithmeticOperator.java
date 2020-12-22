package b_operator;

public class ArithmeticOperator {
	public static void main(String[] args){
		/*
		 * 산술연산자
		 * - 사칙연산 : +, -, *, /, %
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --      1만큼 증/감
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		//곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		System.out.println(result);
		
		//나머지 연산
		
		{result = 10/3;
		System.out.println(result);
		//3.3333333... 이 연산의 결과여야 하지만 타입이 int이기 때문에 정수만 표현된다.
		result = 10 % 3;
		System.out.println(result);
		}
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		{result = 1+1;
		System.out.println(result);
		result = 2-1;
		System.out.println(result);
		result = 1*3;
		System.out.println(result);
		result = 10/2;
		System.out.println(result);
		result += 1;
		result += 1;
		System.out.println(result);}
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		{result = result +3;
		System.out.print(result);
		
		result +=3;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 2;
		System.out.println(result);}
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		{//result = result + 10;
		//result = result - 2 * 3;
		//result = result % 5;
		
		result += 10;
		System.out.println(result);
		result -= 6;
		System.out.println(result);
		result %= 5;
		System.out.println(result);}
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		{++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = "+ ++i);
		i = 0;
		System.out.println("i++ = "+ i++);
		System.out.println(i);
		}
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		{int in = 10;
		double d = 3.14;
		double result2 = in + d; // 표현범위가 더 큰 타입으로 형변환된다.
		System.out.println(result2);
		
		long lon = 100;
		lon = in + lon;
		System.out.println(lon);
		in = in + (int)lon;
		
		byte by = 5;
		short sh = 10;
		int result3 = by + sh; //int보다 작은 타입은 int로 형변환된다.
		System.out.println(result3);
		
		char ch = 'a';
		char ch2 = 'b';
		char ch3 = ' ';
		in = ch + ch2;
		String str = "";
		ch3 = (char)in;
		System.out.println(ch3);
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상.
		byte b =127;
		b++;
		System.out.println(b); //가장 작은 숫자로 가게됨.(index)
		b--;
		System.out.println(b); // 가장 큰 숫자로 가게됨.(index)
		
		//타입을 선택할 때 연산의 범위를 고려해야한다.
		}
		
		//다음을 한줄씩 꼐산해서 최종 결과값을 출력하시오.
		{//1. 123456 + 654321
//		2. 1번의 결과값 * 123456
//		3. 2번의 결과값 / 123456
//		4. 3번의 결과값 - 654321
//		5. 4번의 결과값 % 123456
		
		double answer;
		answer = 123456 + 654321;
		System.out.println(answer);
		answer *=123456;
		System.out.println(answer);
		answer /=123456;
		System.out.println(answer);
		answer -=654321;
		System.out.println(answer);
		answer %= 123456;
		System.out.println(answer);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int a = 5;
		int b = 2;
		int c = 3;
		double res = a+b+c;
		System.out.println(res);
		res /= 3;
		System.out.println(res);
		
		int sum = a+b+c;
		double avg = sum/3.0;			//두 변수가 정수이면 소수가 안나옴. 둘 중 하나를 소수로 바꿔야함
		System.out.println(avg);   
		
		//반올림
//		avg = Math.round(avg);
//		System.out.print(avg);
		System.out.println(avg = Math.round(avg *100)/100.0);
		System.out.println(avg);
		
		}
		
		//random
		int random =(int)(Math.random()*100)+1;	//0.0 ~ 0.999999...
		System.out.println(random);
	
	}
}
