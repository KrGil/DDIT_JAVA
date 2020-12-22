package fun_fun;

import java.util.Arrays;
import java.util.Scanner;

public class Dinner_class {
	
	public static void dinner(){
		int input_num = 0;
		Scanner s = new Scanner(System.in);
//		System.out.print("마음에 드는 숫자를 입력해 주세요~ > ");
//		input_num = Integer.parseInt(s.nextLine());
		// 숫자 입력받기
		
		//랜덤한 수 배분하기
		String[] menu = new String[]{ "바로분식","국수집", "맥도날드","맘스터치","부대찌개","Subway" }; //각 메뉴마다 랜덤값 넣기
		int num = (int) (Math.random()*(menu.length));
//		//test
//		for(int i =0; i < 10; i ++){
//			System.out.println(num);			
//		}
		
		System.out.println("-------- 저녁  --------");
		for(int i =0; i < 3; i ++){
			try {
				Thread.sleep(200);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\t"+"  "+(i+1));
		}
		try {
			Thread.sleep(500);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------오늘은...-----");
		try {
			Thread.sleep(1000);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\t"+menu[num]);
		s.close();
	}
	
	
}
