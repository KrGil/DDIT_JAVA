package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){ } : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if(조건식) { } : 다수의 조건이 필요할 때 if뒤에 추가한다.
		 * - else{ } : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
			
		int a = 1;
		{	
		if(a == 1){
			System.out.println("조건식의 연간결과가 True이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 False이면 수행되지 않는다.");
		}
		
		//else if
		if(a == 1){
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a ==2){
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a ==3){
			System.out.println("a가 3인 겨우에 하고싶은 것");
		}else{ //항상 마지막에
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		if(a < 10){//별개의 if문임. 하고프면 else if 사용.
			System.out.println("a가 10보다 작다.");
		}if(a < 20){
			System.out.println("a가 20보다 작다.");
		}
		
		}
		//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;
		
		if (60 <= score){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		//성적에 등급을 부여하는 프로그램을 만들어보자.
		{
		score = 80;
		String grade = null;
		
		if (score >=90){
			grade = "A";	
		}else if(80 <= score && 90 > score){
			grade = "B";
		}else if(70 <= score && 80 > score){
			grade = "C";
		}else if(60 <= score && 70 > score){
			grade = "D";
		}else if(50 <= score && 60 > score){
			grade = "F";
		}
		System.out.printf("%d점에 해당하는 등급은 %s입니다.\n", score, grade);
		
		
		System.out.println("당신의 점수를 입력하세요 > ");
//		score = Integer.parseInt(sc.nextLine());
		grade = null;
		if(score >= 90){
			grade = "A";
			if(score >= 97){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if (score >= 80){
			grade = "B";
			if(score >= 87){
				grade += "+";
			}else if (score <= 83){
				grade += "-";
			}
		}else if (score >= 70){
			grade = "C";
			if(score >= 77){
				grade += "+";
			}else if (score <= 73){
				grade += "-";
			}
		}else if(score >= 60){
			grade = "D";
		}else {
			grade = "f";
		}
		System.out.printf("%d점에 해당하는 등급은 %s입니다.\n", score, grade);
		}
		
		/*
		 * switch문
		 * - switch(int/String){case 1: break;}
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		{
		a = 1;
		
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고 싶은것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고 싶은 것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고 싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고싶은 것");
			break;
		}
		
		String b ="a";
		
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고 싶은 것");
			break;
		case "b":
			System.out.println("b가 \"a\"인 경우에 하고 싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
			break;			
		}
		
		//주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "bom";
			break;
		case 6:
		case 7:
		case 8:
			season = "summer";
			break;
		case 9:
		case 10:
			season = "fall";
			break;
		case 11:
		case 12:
		case 1:
		case 2:
			season = "winter";
			break;
		}
		
		score = 90;
		String grade = null;
		
		switch(score / 10){
		case 10: case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade ="F";
		}
		System.out.println(score + "점에 대한 등급은" + grade + "입니다.");
		
		}
		//숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요.
//		System.out.print("원하는 숫자를 넣으세요 > ");
//		int num = Integer.parseInt(sc.nextLine());
		{
//		System.out.print("원하는 숫자를 넣으세요 > ");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		//switch
//		switch(num){
//		case 0:
//			System.out.print("숫자가 0입니다.");
//			break;
//		default:
//			System.out.print("숫자가 0이 아닙니다.");
//			break;
//		}
//		
//		//if
//		if (num == 0){
//			System.out.println("숫자가 0입니다.");
//		}else{
//			System.out.println("숫자가 0이 아닙니다.");
//		}
		}
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해 주세요
		
		//switch
//		switch(num % 2){
//		case 0:
//			System.out.println("짝수");
//			break;
//		case 1:
//			System.out.println("홀수");
//			break;
//		}
//		
//		//if
//		if(num % 2 == 0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다.");
//		}
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		{
//		System.out.print("첫번째 점수 > ");
//		int x = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 점수 > ");
//		int y = Integer.parseInt(sc.nextLine());;
//		System.out.print("세번째 점수 > ");
//		int z = Integer.parseInt(sc.nextLine());;
//		
//		int sum = x+y+z;
//		double avg = sum/3.0;
//		
//		String grade;
		}
		//if
		{
//		if (avg >= 90){
//			grade = "A";
//		}else if(avg >= 80){
//			grade = "B";
//		}else if(avg >= 70){
//			grade = "C";
//		}else if(avg >= 60){
//			grade = "D";
//		}else{
//			grade = "F";
//		}
//		System.out.println("당신의 총점은 "+sum+"이고  평균은 " +Math.round(avg*10)/10.0+"이며, 등급은 "+grade+"입니다.");
		}
		//switch
		{
//		int round_avg = (int) Math.round(avg);
//		switch(round_avg / 10){
//		case 10: case 9: grade = "A"; break;
//		case 8: grade = "B"; break;
//		case 7: grade = "C"; break;
//		case 6: grade = "D"; break;
//		default : grade ="F";
//		}
//		System.out.println("당신의 총점은 "+sum+"이고 평균은 " +Math.round(avg*10)/10.0+"이며, 등급은 "+grade+"입니다.");
		}
		
		// 1 ~ 100 사이의 랜덤한 숫자를 3개 발생시키고 오름차순으로 출력해주세요.
		int random1 = (int) (Math.random()*100)+1;
		int random2 = (int) (Math.random()*100)+1;
		int random3 = (int) (Math.random()*100)+1;
//		int first = 0;
//		int second = 0;
//		int third = 0;
//		
//		if (random1 > random2 && random1 > random3){ //random1이 random2보다 크고 random1이 random3보다 클 때
//			first = random1;						//첫번째 숫자 first는 random1로 정한다.
//			if(random2 > random3){						//그리고 random2가 random3보다 클 때
//				second = random2;						//두번째 숫자 second는 rando2로 정하고
//				third = random3;						//세번째 숫자 third는 random3으로 정한다.
//			}else{									//그 외의 경우
//				second = random3;					//두번째 숫자 second는 random3으로 정하고
//				third = random2;					//세번째 숫자 third는 random2로 정한다.
//			}
//		}else if(random2 > random1 && random2 > random3){
//			first = random2;
//			if(random1 > random3){
//				second = random1;
//				third = random3;
//			}else{
//				second = random3;
//				third = random1;
//			}
//		}else if(random3 > random1 && random3 > random1){
//			first = random3;
//			if(random1 > random2){
//				second = random1;
//				third = random2;
//			}else{
//				second = random2;
//				third = random1;
//			}
//		}else{
//			System.out.println("같은숫자니까 다시");
//		}
//		System.out.println("1 - "+third+" |2- "+second+"  |3- "+first);

		
		//teacher
		//a b c
		//가장 작은 수
		int temp = 0;
		if (random1 > random2){		//a랑 b
			temp = random1;			//b가 a보다 크다면  
			random1 = random2;		//a와 b를  바꾼다.
			random2 = temp;			
		}
//		System.out.println(random1 +"   "+ random2 + "   " + temp);
		if (random1 > random3){		//a 랑 c
			temp = random1;			//c가 a보다 크다면
			random1 = random3;		//c와 a를 바꾼다.
			random3 = temp;
		}
		//****************a의 값이 구해짐 ***************
//		System.out.println(random1 + "   " + random2+ "   " + temp);
		//중간수
		if (random2 > random3){		//두번째 수 
			temp = random2;			//b 랑 c
			random2 = random3;		//b가 c보다 크다면
			random3 = temp;			//b와 c를 바꾼다.
		}
		//****************b의 값이 구해짐 ****************
		//자동으로 c의 값이 정해진다.
		
		System.out.println(random1 + " " + random2 + " " + random3 + "   " + temp);
		sc.close();
	}
}
