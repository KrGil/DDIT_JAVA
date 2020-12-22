package Homework;

import java.util.Scanner;

public class SetfTest {
	public static void main(String[] agrs){
		
		Scanner sc = new Scanner(System.in);
		int ctn = 0;
		System.out.println("=======================================");
		System.out.println("==========탄수화물 중독 자가진단 테스트==========");
		System.out.println("맞으면 y 틀리면 n을 쳐주세요.");
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다. > ");
		String y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이없다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다. > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다 > ");
		y = sc.nextLine();
		if(y.equals("y")){ctn++;}
		System.out.println("=======================================");
		System.out.println("============      결과            =============");
		//if
		if(ctn < 3){
			System.out.println("------------------3 개------------------");
			System.out.println("------------------주의!-----------------");
			System.out.println("위험한 수준은 아니지만 관리가 필요!");
		}else if(ctn <6){
			System.out.println("-----------------4~6 개-----------------");
			System.out.println("------------------위험!-----------------");
			System.out.println("탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		}else{
			System.out.println("-----------------7 개 이상----------------");
			System.out.println("------------------중독!-----------------");
			System.out.println("전문의 상담이 필요함");
		}
//		switch(ctn){
//		case 1 :
//		case 2 :
//		case 3 :
//			
//			System.out.println("------------------3 개------------------");
//			System.out.println("------------------주의!-----------------");
//			System.out.println("위험한 수준은 아니지만 관리가 필요!");
//			break;
//		case 4 :
//		case 5 :
//		case 6 :
//			
//			System.out.println("-----------------4~6 개-----------------");
//			System.out.println("------------------위험!-----------------");
//			System.out.println("탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
//			break;
//		case 7 :
//		case 8 :
//		case 9 :
//		case 10:
//			System.out.println("-----------------7 개 이상----------------");
//			System.out.println("------------------중독!-----------------");
//			System.out.println("전문의 상담이 필요함");
//			break;
//		}
		sc.close();
		
		
		}
}
