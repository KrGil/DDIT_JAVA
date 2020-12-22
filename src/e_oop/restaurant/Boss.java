package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba a = new Alba();
//		a.order();
		String[] order = a.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("오리 만드는 중... 완성!!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"};
		
		a.serve(foods);
		
		a.pay(order);
	}
}
