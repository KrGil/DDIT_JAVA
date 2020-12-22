package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 비트연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타연산자
		 * - .(참조연산자) : 특정 범위 내에 속해 있는 맴버를 지칭할 때 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자, 조건연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		//1byte : 01010101
		System.out.println(10 | 15); //| : 둘다 0인 경우 0 그 외 1
		//10 : 00001010
		//15 : 00001111
		//     00001111
		
		int x = 10;
		int y = 20;
		int result = x<y ? x : y; //int result = x;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2이면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
//		System.out.println(gender);
		
		gender = regNo == 1 ? "Man":(regNo ==2 ? "여자" : "확인불가");
		System.out.println(gender);
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주시요.
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
//		System.out.println("첫번째 아무 숫자를 입력해 주세요");
//		a = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 아무 숫자를 입력해 주세요");
//		b = Integer.parseInt(sc.nextLine());
//		String answer = a <= b ? "둘 중 큰 숫자는 "+b : "둘 중 큰 숫자는 "+a;
//		System.out.println(answer);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4이면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.print("첫 번째 숫자");
		a = Integer.parseInt(sc.nextLine());
		
		String res = a == 1 || a == 3 ? "남자" :(a == 2 || a ==4 ? "여자" : "확인불가");
		System.out.println(res);sc.close();
	}
}
