package a_variable;

import java.util.Arrays;
import java.util.Scanner;


public class test1 {
	public static void main(String[] args){
		//2개의 값을 입력받아 5개의 연산을 하는 계산기를 만들어 보라.
		Scanner sc = new Scanner(System.in);
		//1
		int a = 3;
		int b = 2;
		if (a > b){
			System.out.println("안녕");
		}
		//2번
		//a = 10 b = 6이고  a가 b보다 클때
		//숫자 1,2,3,4,5,6,7,8,9,10을 출력하시오.
		
		//3번
		//a = 4 b = 10이고 b가 a보다 클 때
		//콘솔창에 'b는 a보다 크다'를 출력하시오. 
		
		
		//4번도 해잉
		//  콘솔창에
		//1. a의 값을 입력하시오 > 를 띄우고
		//2. 입력받은 값을 변수 x에 넣고
		//	콘솔창에
		//3. b의 값을 입력하시오 > 를 띄우고
		//4. 입력받은 값을 변수 y에 넣고
		//	콘솔창에
		//5. x + y = ?를 출력하시오.
		
		//가위바위보
		
		//주사위?

	
		//
//		- 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		//두번째 숫자를 변수에 저장한다.
		//앞의 숫자와 비교해서 큰수를 만나면 한칸 뒤로 보낸다.
		//작은수를 만나면 작은수의 바로 뒷칸에 변수의 값을 저장하고 반복문읠 빠져나간다.
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random()*100)+1);
		}
		System.out.println(Arrays.toString(arr));
		
		//삽입정렬 시작
		for(int i =1; i <arr.length; i ++){
			//두번째 숫자를 변수에 저장한다.
			int temp = arr[i];
			System.out.println("temp : "+temp);
			int j = 0;
			for(j = i-1; j >= 0; j --){
				System.out.println("j = "+j);
				System.out.println(Arrays.toString(arr)+ "-- for문 시작 전");
				//앞의 숫자와 비교해서 큰수를 만나면 한칸 뒤로 보낸다.
				System.out.println("arr[j+1] = "+arr[j+1]+"  temp = "+temp);
				if(arr[j] > arr[j+1]){// temp를 쓰면 잘 됨 arr[j+1] 하면 안됨 why?????
					System.out.println("arr["+j+"] : "+ arr[j]);
					arr[j+1] =arr[j];
				}else{
					break;
				}
			}
			//작은수를 만나면 작은수의 바로 뒷칸에 변수의 값을 저장하고 반복문을 빠져나간다.
			arr[j+1] = temp;
			System.out.println(Arrays.toString(arr)+"--j+1에 템프를 넣음");
			System.out.println();
		}System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
