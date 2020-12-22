package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args){
		//sysout + Ctrl + Spacebar : System.out.println()
		//라인삭제 : Ctrl + D
		//라인복사 : Ctrl + Alt + 방향키(위/아래)
		//라인이동 : Alt + 방향키(위/아래)
		
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다. --> 다른곳에저장해서 그 주소를 저장.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //-->길이 인덱스 x //배열이 생성되고 그 주소가 저장된다.
		//배열 초기화 시 기본값이 저장된다.
		/*
		 * 기본값
		 * 정수 : 0
		 * 실수 : 0.0
		 * 문자 : ' '(0)
		 * 논리 : false
		 * 참조형 : null
		 */
		array = new int[]{1,2,3,4,5};
		{
//		array = {1,2,3,4,5};
//		//선언과 초기화를 동시에 해야지 먹힌다.
		int[] array1 = {1,2,3,4,5};
		//요런식으로.
		int[] array2 = new int[3];
//		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
//		
		for(int i = 0; i <= 4; i++){
//			System.out.println(array[i]);
		}
		for(int i = 0; i <=4; i ++){
			array[i] = (i+1)*10;
//			System.out.println(array[i]);
		}
		int sum = 0;
		for(int i = 0; i <array.length; i++){
			sum += array[i];
		}
//		System.out.println("합계 : " + sum);
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		
		int[] array_1 = new int[10];
		
		//배열의 모든 인덱스에 1~100 사이의 랜덤한 값을 저장해 주세요.
		{
		for (int i = 0; i < array_1.length; i ++){
			array_1[i] = (int)(Math.random()*100)+1;
//			System.out.println(array_1[i]);
		}
//		System.out.println(Arrays.toString(array_1));
		}
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		int sum=0;
		double avg;
		for (int i = 0; i < array_1.length; i ++){
			sum +=array_1[i];
		}
		
		avg = sum/(double)Math.round((array_1.length*10)/10.0);//Math.round(avg*100)/100.0
//		System.out.println("합계 : "+ sum + "  평균 : " + avg );
		
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		//최소값과 최대값을 저장할 변수를 만들고 0번 인덱스의 값을 저장한다.
		int max =array_1[0];
		int min =array_1[0];
		//배열의 모든값을 비교하기 위해 0번 인덱스부터 마지막인덱스까지 반복한다.
		for (int i = 0; i < array_1.length; i ++){
			//최소값과 배열의 모든 인덱스값을 비교해 더 작은 값을 만나면 최소값으로 저장한다.
			if(min > array_1[i]){
				min = array_1[i];
			}
			//최대값과 배열의 모든 인덱스값을 비교해 더 큰 값을 만나면 최대값으로 저장한다.
			if(max <= array_1[i]){
				max = array_1[i];
			}
		}
//		System.out.println("max : "+ max + " min : "+min);
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i ++){
			shuffle[i] = i+1;
		}
		System.out.println(Arrays.toString(shuffle));
		//배열의 값을 섞어주세요.
		int cnt =0;
		int temp = 0;
		while(cnt <=100){
			// 0 ~ 9사이의 랜덤한 인덱스를 발생시킨다.
			int ran = (int)(Math.random()*9);
			// 0번인덱스의 값과 랜덤한 인덱스의 값을 바꾼다.
			temp = shuffle[0];
			shuffle[0] =shuffle[ran];
			shuffle[ran] = temp;
			cnt ++;
		}
		
//		for(int i =0; i <100; i++){
//			int ran = (int)(Math.random()*shuffle.length);
//			// 0번인덱스의 값과 랜덤한 인덱스의 값을 바꾼다.
//			temp = shuffle[0];
//			shuffle[0] =shuffle[ran];
//			shuffle[ran] = temp;
//		}
			System.out.println(Arrays.toString(shuffle));
			
		int[] test_arr = new int[10];
		for(int i =0; i <=test_arr.length-1; i++){
			test_arr[i]=(int)(Math.random()*100);
		}System.out.println(Arrays.toString(test_arr));
		//최대값 최소값 출력하기
		int ma = test_arr[0];
		int mi = test_arr[0];
		for(int i = 0; i < test_arr.length-1; i++){
			if(ma < test_arr[i]){
				ma = test_arr[i];
			}
			if(mi > test_arr[i]){
				mi = test_arr[i];
			}
		}System.out.println("ma : " + ma + "  mi : "+mi);
		
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해 주세요.
//		int one=0;		int two=0;		int three=0;		int four=0;
//		int five=0;		int six=0;		int seven=0;		int eight=0;
//		int nine=0;		int ten=0;
//		int sum1 = one + two + three + four + five + six + seven + eight + nine + ten;
//		
//		for(int i = 0; i < 500; i ++){
//			int ran1 = (int)(Math.random()*10)+1;
//			
//			switch(ran1){
//				case 1: one += 1;break;
//				case 2: two += 1; break;
//				case 3: three += 1;	break;
//				case 4: four += 1;	break;
//				case 5: five += 1;	break;
//				case 6: six += 1;	break;
//				case 7: seven += 1;	break;
//				case 8: eight += 1;	break;
//				case 9: nine += 1;break;
//				case 10: ten += 1;break;
//			}
//		}
//		System.out.print("1: "+ one+"번 , "+"2: "+ two+"번 , "+"3: "+ three+"번 , "+"4: "+ four+"번 , "
//						+"5: "+ five+"번 , "+"6: "+ six+"번 , "+"1: "+ seven+"번 , "+"1: "+ eight+"번 , "+
//						"9: "+ nine+"번 , "+"10: "+ ten+"번 , "+"총 : "+sum1+"번");

		//		int ran1 = (int)(Math.random()*10)+1;
//		int cnt1 = 0;
//		int[] arr = new int[10];
//		for(int i = 0; i< arr.length; i++){
//			for(int j = 1; j <= 500; j++){
//				cnt1++;
//				if(i+1 == ran1) arr[i]+=1; 
//			}
//		}System.out.println(Arrays.toString(arr) + cnt1);
		
//		int aa = 0;
//		for(int i =0; i < arr.length; i++){
//			System.out.println(aa +" "+ arr[i]);
//			aa += arr[i];
//		}System.out.println(aa);
		
		int[] count = new int[10];
		for(int i = 0; i < 500; i ++){
			int random = (int)(Math.random()*10)+1;
//			if (random == 1)count[0]++;
//			if (random == 2)count[1]++;
//			if (random == 3)count[2]++;
			count[random -1]++;
		}System.out.println(Arrays.toString(count));
		
		//위 문제의 최소값, 최대값, 발생횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		//내가 한것
		int random = 0;
		Scanner s = new Scanner(System.in);
//		System.out.println("최대값 최소값 발생횟수를 입력해 주세요.");
//		System.out.println("최대값 > ");
//		max = Integer.parseInt(s.nextLine());
//		System.out.println("최소값 > ");
//		min = Integer.parseInt(s.nextLine());
//		System.out.println("발생횟수 >");
//		cnt = Integer.parseInt(s.nextLine());
//		
//		int[] num = new int[max-min+1];
//		for(int i = 0; i < cnt; i ++){
//			random = (int)(Math.random()*(max - min)+1)+min;
//			num[random-1]+=1;
//			//min 1 max 10
//			//min 2 max 20  -- +1  19
//			//min 3 max 10 -- +2 9
//			//min 4 max 30 -- +3 27
//			//기찬 날리자
//		}System.out.println(Arrays.toString(num));
		
		
		System.out.print("최소값 > ");
		int mini = Integer.parseInt(s.nextLine());
		System.out.print("최대값 > ");
		int maxi = Integer.parseInt(s.nextLine());
		System.out.print("발생횟수 > ");
		int repeat = Integer.parseInt(s.nextLine());
		
		int[] ccnt = new int[maxi-mini+1];
		for(int i = 0; i < repeat; i ++){
			random = (int)(Math.random()*(maxi-mini+1)+mini);
			ccnt[random-mini]++;
		}System.out.println(Arrays.toString(ccnt));
		s.close();
	}
}
