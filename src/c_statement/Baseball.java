package c_statement;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args){
		/*
		 * 135
		 * 
		 * 123 : 1s 1b 1o
		 * 136 : 2s 0b 1o
		 */
//	int off = 1; //0~100
//					//100 ~ 100
//	//0.0000000001 ~ 0.9999999999999
//	int random1 = (int)(Math.random()*9 )+ 1;
//	int random2 = (int)(Math.random()*9 )+ 1;
//	int random3 = (int)(Math.random()*9 )+ 1;
//	Scanner s = new Scanner(System.in);
//	int answer1 = 0;
//	int answer2 = 0;
//	int answer3 = 0;
	//	int answer =
	
//	if (random1 == random2 || random1 == random3 || random2 == random3){
////		System.out.println("re");
//		do{
////				System.out.println("while"); 
//			if(random1 == random2){
//				random2 = (int)Math.random()*9 + 1;
//			}else if(random1 == random3){
//				random3 = (int)Math.random()*9 + 1;
//			}else if(random2 == random3){
//				random3 = (int)Math.random()*9 + 1;
//			}
////			System.out.println(random1 +" "+ random2 +" "+ random3); 
//		}while(random1 == random2 || random1 == random3 || random2 == random3);
//	}
		
		//me
		{
		
//		int off = 1; //0~100
//		off=1;
//		//0.0000000001 ~ 0.9999999999999
//		int random1 = (int)(Math.random()*9 )+ 1;
//		int random2 = (int)(Math.random()*9 )+ 1;
//		int random3 = (int)(Math.random()*9 )+ 1;
//		Scanner s = new Scanner(System.in);
//		int answer1 = 0;
//		int answer2 = 0;
//		int answer3 = 0;
//		
//		//랜덤수 설정
//		if (random1 == random2 || random1 == random3 || random2 == random3){
////			System.out.println("re");
//			do{
////					System.out.println("while"); 
//				if(random1 == random2){
//					random2 = (int)Math.random()*9 + 1;
//				}else if(random1 == random3){
//					random3 = (int)Math.random()*9 + 1;
//				}else if(random2 == random3){
//					random3 = (int)Math.random()*9 + 1;
//				}
////				System.out.println(random1 +" "+ random2 +" "+ random3); 
//			}while(random1 == random2 || random1 == random3 || random2 == random3);
//		}
//	//시작
//	System.out.println("게임을 시작하지.");
//	do{
//		System.out.println(random1 +" "+ random2 +" "+ random3);
//		int st = 0;
//		int b = 0;
//		int o = 0;
//		
//		System.out.print("첫번째 숫자를 입력하시오. > ");
//		answer1 = Integer.parseInt(s.nextLine());
//		if(answer1 >=10){				//예외처리 
//			System.out.println("10보다 작은 숫자를 입력해주세요.");
//			System.out.println();
//			continue;
//		}
//		System.out.print("두번째 숫자를 입력하시오. > ");
//		answer2 = Integer.parseInt(s.nextLine());
//		if(answer1 == answer2){			//예외처리
//			System.out.println("같은숫자 말고 서로 다른 숫자를 입력해주세요.");
//			System.out.println();
//			continue;
//		}else if(answer2 >=10){
//			System.out.println("10보다 작은 숫자를 입력해주세요.");
//			System.out.println();
//			continue;
//		}
//		System.out.print("세번째 숫자를 입력하시오. > ");
//		answer3 = Integer.parseInt(s.nextLine());
//		if(answer3 == answer2 || answer3 == answer1){		//예외처리
//			System.out.println("같은숫자 말고 서로 다른 숫자를 입력해주세요.");
//			System.out.println();
//			continue;
//		}else if(answer3 >=10){
//			System.out.println("10보다 작은 숫자를 입력해주세요.");
//			System.out.println();
//			continue;
//		}
//		
//		if(answer1 == random1){
//			st += 1;
//		}else if(answer1 == random2 || answer1 == random3){
//			b += 1;
//		}else{o+=1;} //첫번째 숫자 검사.
//		
//		if(answer2 == random2){
//			st += 1;
//		}else if(answer2 == random1 || answer2 == random3){
//			b += 1;
//		}else{o+=1;}	//두번째 숫자.
//		
//		if(answer3 == random3){
//			st += 1;
//		}else if(answer3 == random2 || answer3 == random1){
//			b += 1;
//		}else{o+=1;}	//세번째 숫자.
//		
//		System.out.println(answer1+""+answer2+""+answer3+" : "+st+"S "+b+"B "+o+"O ");
//		if(answer1 == random1 && answer2 == random2 && answer3 == random3){ //정답일 시
//			System.out.println("정답! 3진! 다시 시작하시겠습니까?(Y/N)");
//			String a = s.nextLine();
//			if (a.equals("y") || a.equals("Y")){		//다시할 시
//				System.out.println("다시!");
//				random1 = (int)(Math.random()*9 )+ 1; //랜덤넘버 다시 재부여
//				random2 = (int)(Math.random()*9 )+ 1;
//				random3 = (int)(Math.random()*9 )+ 1;
//					if (random1 == random2 || random1 == random3 || random2 == random3){
////						System.out.println("re");
//						do{
////								System.out.println("while"); 
//							if(random1 == random2){
//								random2 = (int)Math.random()*9 + 1;
//							}else if(random1 == random3){
//								random3 = (int)Math.random()*9 + 1;
//							}else if(random2 == random3){
//								random3 = (int)Math.random()*9 + 1;
//							}
////							System.out.println(random1 +" "+ random2 +" "+ random3); 
//						}while(random1 == random2 || random1 == random3 || random2 == random3);
//					}
//				}else{
//					off = 0;			
//					System.out.println("게임을 종료합니다.");
//				}
//			}
//		}while(off == 1);
	}
	//ssam
	int a1 = (int)(Math.random()*9)+1;
	int a2;
	int a3;
	
	do{
		a2 = (int)(Math.random()*9) +1;
	}while(a1 == a2);
	do{
		a3 = (int)(Math.random()*9) +1;
	}while(a1 == a3 || a2 == a3);
	
	Scanner s = new Scanner(System.in);
	int count = 0;
	while(true){
		System.out.print("3자리 숫자 > ");
		int input = Integer.parseInt(s.nextLine());
		int i3 = input % 10; //123 // 3
		input /= 10;		//123  // 12
		int i2 = input % 10;  // 12 // 2 
		input /= 10;		//12 // 1
		int i1 = input % 10; // 1 // 1
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		if(a1 == i1) strike++;
		if(a2 == i2) strike++;
		if(a3 == i3) strike++;
		
		if(a1 == i2 || a1 == i3) ball++;
		if(a2 == i1 || a2 == i3) ball++;
		if(a3 == i1 || a3 == i1) ball++;
		
		out = 3 - strike - ball;
		
		System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
				+ strike + "S " + ball + "B " + out + "O");
		System.out.println("------------------------------");
		if(strike == 3){
			System.out.println("정답입니다!!");
			break;
		}
	}
	
	s.close();
	
	}
}
