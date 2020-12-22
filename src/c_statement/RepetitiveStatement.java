package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문
		 *  - for(초기화; 조건식; 증감식){ }
		 *  - 포함하고 있는 문장들을정해진 횟수만큼 반복하게 해주는 문장
		 */
		{
		for(int i = 1; i <= 10; i++){
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가  true이면 블럭안의 내용을 수행
			//증감식 : 변수를 증가/감소시켜 반복문을 제어
			System.out.println(i);
		}
		
//		int sum = 0; //1부터 10까지 합꼐를 저장
//		sum +=1;
//		sum +=2;
//		sum +=3;
//		sum +=4;
//		sum +=5;
//		sum +=6;
//		sum +=7;
//		sum +=8;
//		sum +=9;
//		sum +=10;
//		System.out.println(sum);
//		
//		sum = 0;
//		for(int i = 1; i <=10; i++){
//			sum +=i;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		for(int i = 100; i >= 1; i--){
//			sum +=i;
//		}
//		System.out.println(sum);
//		
		
		//1부터 100까지의 짝수의 합을 출력해주세요.
		//1.
//		sum = 0;
//		for (int i= 1; i <=100; i++){
//			if(i % 2 == 0)	sum+=i;
//		}
//		//2.
//		sum = 0;
//		for (int i= 2; i <=100; i+=2){
//			sum+=i;
//		}
//		System.out.println(sum);
//		
		//1부터 100까지 홀수의 합을 출력해 주세요.
		//1.
//		sum = 0;
//		for(int i = 1; i <=100; i++ ){
//			if(i % 2 != 0) sum +=i;
//		}
//		System.out.println(sum);
//		//2.
//		sum = 0;
//		for(int i = 1; i <=100; i+=2){
//			sum += i;
//		}
//		System.out.println(sum);
//		
		//구구단 출력
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 */
	
//		int num = 0;
//		sum = 0;
//		
//		
//		for(int i = 1; i <= 9; i++){
////			System.out.println("================="+i+"단 시~작!================= ");
//			for(int j = 2; j <=9; j++){
//				sum = j*i;
//				System.out.print(j + " * " + i + " = "+sum + "\t");
//				if( j ==9 ){
//					System.out.println();
//				}
//			}
		}
		//1단씩 출력하기
		{
//		sum = 0;
//		for(int i = 1; i <=9; i ++){
//			System.out.println(2 + " * "+i+ " = "+(2*i));
//		}
//		sum = 0;
//		for(int i = 1; i <= 9; i ++){
//			System.out.println(8 + " * "+i+" = "+(8*i));	
//		}
		}
		//원하는 단 입력 받아서 출력하기 
		{
//		System.out.print("원하는 단을 입력해주세요(단, 숫자는 1~9까지만) > ");
//		
//		num = Integer.parseInt(sc.nextLine());
//		sum = 0;
//		if(num >=1 &&num <=10){	
//			for(int i = 1; i <= 9; i ++){
//				System.out.println(num + " * "+i+" = "+(num*i));
//				
//			}
//		}else{
//			System.out.println("설명 다시 읽고 오세요~");
//		}
		}
		
		/*
		 * while문
		 *  - while(조건식) { }
		 *  - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 *  - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
		
		int a =1;
		//a에 2씩 몇번을 곱해야 1000이상이 되는지 알아봅시다.
		int count = 0;
		while(a < 1000){
			a *= 2;
			count ++;
			System.out.println(count + " : "+a);
		}
		
		/*
		 * do-while문
		 * - do{ }whilte(조건식); -- 먼저 실행을 하고 조건식을 검사한다.
		 * - 최소한 한번의 수행을 보장한다.
		 */
		{
		//숫자 맞추기 게임
		int num = (int)(Math.random()*100)+1;
		int input = 0;
		
//		do{
//			System.out.println("1 ~ 100사이의 수를 입력해주세요 > ");
//			input = Integer.parseInt(sc.nextLine());
//			if(num < input){
//				System.out.println(input + " 보다 작습니다.");
//			}else if(input < num){
//				System.out.println(input + " 보다 큽니다.");
//			}else{
//				System.out.println("정답입니다!!");
//			}
//		}while(input != num);
//		
		int on = 0;
		while(on == 0){
			System.out.println("1");
			on = 1;
		}
		//이름붙은 반복문
		outer : for(int i = 2; i <= 9; i++){
			for(int j =1; j <= 9; j++){
				if(j==5){
					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; // outer라는 이름의 반복문을 빠져나간다.
//					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//					continue outer; // outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		}
		//별찍기
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		
//		for(int i = 1; i <= 3; i ++){
//			for(int j = 1; j <= 5; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 5; i ++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int cnt = 2;
		for(int i = 1; i <= 5; i +=2){
			if( i <= 3){
				for(int z = cnt; z>=1; z-- ){
					
					System.out.print(" ");
				}
				cnt--;
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}
			}else{
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i <= 4; i ++){
			for(int j = 0; j < 3-i; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i = 5; i >= 1; i --){
//			for(int j = i; j >=1; j-- ){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		sc.close();
	}
}
