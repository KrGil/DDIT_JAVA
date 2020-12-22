package a_variable;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
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
			 */
	String id;
	int age;
	int pw;
	String name;
	Double height;
	
	System.out.println("=================회원가입===================");
	System.out.print("input your ID > ");
	id = sc.nextLine();
	
	System.out.print("input your password > ");
	pw = Integer.parseInt(sc.nextLine());
	
	System.out.print("input your name > ");
	name = sc.nextLine();
	
	System.out.print("input your age > ");
	age = Integer.parseInt(sc.nextLine());
	
	System.out.print("input your height > ");
	height = Double.parseDouble(sc.nextLine());
	
	
	System.out.println("==========================================");
	System.out.print("ID : "+id+"\nPassword : "+pw+"\nName : "+name+"\nAge : "+ age +"\nHeight : "+height);
	sc.close();
	}
}
