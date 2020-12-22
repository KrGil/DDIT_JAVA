package Homework;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		//5가지의 연산방법으로
		Scanner sc = new Scanner(System.in);
//		int num1;
//		int num2;
//		
//		String cal;
//		
//		System.out.print("첫번째 숫자를 입력해 주세요");
//		num1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("두번째 숫자를 입력해 주세요");
//		num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("하고싶은 연산을 입력하세요 \n1.더하기(+) \n2.빼기(-) \n3.나누기(/) \n4.곱하기(*) \n5.나머지(%) ");
//		cal = sc.nextLine();
//
//		String result = (cal.equals("+") || cal.equals("1") ? Integer.toString(num1 + num2) :
//			(cal.equals("-") || cal.equals("2") ? Integer.toString(num1 - num2) :
//			(cal.equals("/") || cal.equals("3") ? Integer.toString(num1 / num2) : 
//			(cal.equals("*") || cal.equals("4") ? Integer.toString(num1 * num2) : 
//			(cal.equals("%") || cal.equals("5") ? Integer.toString(num1 % num2) : ("예외처리"))))));
//		System.out.print(num1 + " + " +num2 + " = "+result);
//		
		
		System.out.print("첫번째 숫자 > ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("연산자 > ");
		String op = sc.nextLine();
		System.out.print("두번째 숫자 > ");
		int y = Integer.parseInt(sc.nextLine());
//		
		int result = op.equals("+") ? x + y
				:op.equals("-") ? x-y
						:op.equals("*") ? x*y
								:op.equals("/") ? x / y
										:x % y;
		System.out.println(x + " " + op + " " + y + " = " + result);sc.close();
//				
	}
}
