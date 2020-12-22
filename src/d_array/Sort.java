package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정렬
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
//		석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		// 랜덤수 구하기
	{
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i ++){
//			arr[i] = (int)(Math.random() *100 )+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		// 석차는 모두 1로 맞춰놓고 시작하기
//		int[] rank = new int[arr.length];
//		for(int i = 0; i < arr.length; i ++){
//			rank[i] = 1;
//		}
//		//모두 돌려서 석차 구하기.
//		for(int i = 0; i < arr.length; i ++){
//			for(int j = 0; j < arr.length; j ++){
//				if ( arr[i] < arr[j]){
//					rank[i]++;
//				}
//			}
//		}System.out.println(Arrays.toString(rank));
	}

//		- 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		// 가장 작은 숫자 찾고. 맨 앞에 있는애랑 자리 바꾸기
	{
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i ++){
			arr[i] = (int)(Math.random() *100 )+1;
		}
//		System.out.println(Arrays.toString(arr));
//		int temp =0;
//		int min = arr[1];
//		int index = 0;
//		
//		for ( int i =0; i < arr.length-1; i ++){
//			min = arr[i];
//			temp = arr[i];
//			for(int j = i; j <arr.length; j ++){
//				if(min > arr[j]){
//					min = arr[j];
//					index = j;
//				}				
//			}
//			arr[i] = min;
//			arr[index] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		// 선생님이 한거
		for(int i = 0; i < arr.length-1; i++){
			int mina = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[mina]){
					mina = j;
				}
			}
			int tempa = arr[i];
			arr[i] = arr[mina];
			arr[mina] = tempa;
		}System.out.println(Arrays.toString(arr)+"-------------------선택배열");
	}
		
//		- 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
	{	
		//선생님
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i ++){
			arr[i] = (int)(Math.random() *100 )+1;
		}
		
		for(int i = 0; i < arr.length-1; i++){
			boolean flag = false;
			for(int j = 0; j < arr.length-i-1; j ++){
				if(arr[j] > arr[j + 1]){
					int tempb = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempb;
					flag = true;
				}
			}System.out.println("i: "+ i);
			if (!flag){
				break;
			}
		}System.out.println(Arrays.toString(arr)+"------------버블정렬");
	}
//		- 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		//두번째 숫자를 변수에 저장한다.
		//앞의 숫자와 비교해서 큰수를 만나면 한칸 뒤로 보낸다.
		//작은수를 만나면 작은수의 바로 뒷칸에 변수의 값을 저장하고 반복문읠 빠져나간다.
		int[] arr = new int[5];
		int temp;
		for (int i = 0; i < arr.length;  i ++){
			arr[i] = (int)(Math.random()*100)+1;
		}System.out.println(Arrays.toString(arr));
//		
//		for(int i = 0; i < arr.length; i ++){
//			for(int j = i+1; j < arr.length; j++){
//				temp = arr[j];
//				if(temp < arr[i]){
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}System.out.println("aaa" + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i ++){
			temp = arr[i];
			System.out.println(i+"i==============");
			System.out.println(Arrays.toString(arr) + " -- 초기 배열");
			System.out.println("temp : " + temp);
			int j =0;
//			System.out.println("arr[0] =" + arr[j]);
			
			for(j = i-1; j >= 0; j --){
				if (temp < arr[j]){
					arr[j+1] = arr[j];
				}
				else{ 		// 여기서 j값이 결정된다. 5,4,3
					break;	// 만약 3번째비교에서 작은수가 나와서 break;됬다면 
				}			// j 는 3 임.
			}			
			System.out.println(Arrays.toString(arr)+ " -- for문 이후");
			System.out.println("j : " + j+"  arr[j+1] : "+arr[j+1]);
			arr[j+1] = temp;
			System.out.println("temp : "+ temp+"의 값을 arr["+(j+1)+"]에 넣기!");
			System.out.println(Arrays.toString(arr)+ " -- temp에 있는 값을 빈공간에 넣기!");
			
			System.out.println();
		}System.out.println(Arrays.toString(arr));
	
		
//		- 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		
		
	}

	
	
	
	
	
}
