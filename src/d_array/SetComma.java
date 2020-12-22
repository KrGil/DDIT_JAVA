package d_array;

import java.util.Scanner;

public class SetComma {
	public static void main(String[] args){
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//100000000
		//1,000,000,000
		//String 타입으로 입력 받아서 , 붙이기
		Scanner s = new Scanner(System.in);
		System.out.println(">>>>>>");
		String input = s.nextLine();
//		System.out.println(input.length());
		String re = "";
//		input = "100000000";
//		for(int i = input.length()-1; i>=0; i--){
//			re += input.charAt(i);
//		}
//		System.out.println(re);
//		for(int i = (re).length(); i-1 >=0; i --){
//			System.out.print(re.substring(i-1,i));
//			if(i > 1 && (i-1)%3 ==0){
//				System.out.print(',');
//			}
//		}
		//인덱스를 거꾸로 돌려서 생각한다고 하면 되니까
		for(int i = input.length()-1; i >=0; i --){
			re += input.charAt(i);
		}//거꾸로 돌림. 0001 00001
		for(int i= input.length()-1; i>=0; i --){
			System.out.print(re.charAt(i));
			if(i %3 == 0&& i >0){			
				System.out.print(',');
			}
		}
		
		
		//쌤 -- 더 낫다.   class 선언을 위함.
		System.out.println("숫자입력 > ");
		String number = s.nextLine(); //12345
		String comma = "";
		
		int count =0;
		for(int i = number.length() -1 ; i >= 0; i--){
			comma = number.charAt(i) + comma;
			count++;
			if(count %3 ==0 && count != number.length()){
				comma = "," + comma;
			}
		}
		System.out.println(comma);
		s.close();
	}
}
