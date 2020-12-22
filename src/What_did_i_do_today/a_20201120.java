package What_did_i_do_today;

import java.util.Arrays;

public class a_20201120 {
	public static void main(String[] args){
		//random
											//+1은 0~99이 아니라 1~100
		int random = (int)(Math.random()*100) +1;//0 ~ 0.999999999...
		
//		- 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		//두번째 숫자를 변수에 저장한다.
		//앞의 숫자와 비교해서 큰수를 만나면 한칸 뒤로 보낸다.
		//작은수를 만나면 작은수의 바로 뒷칸에 변수의 값을 저장하고 반복문읠 빠져나간다.
		int[] arr = new int[5];
		int temp;
		for (int i = 0; i < arr.length;  i ++){
			arr[i] = (int)(Math.random()*100)+1;
		}System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i ++){
			temp = arr[i];
			int j =0;
			
			for(j = i-1; j >= 0; j --){
				if (temp < arr[j]){
					arr[j+1] = arr[j];
				}
				else{ 		// 여기서 j값이 결정된다. 5,4,3
					break;	// 만약 3번째비교에서 작은수가 나와서 break;됬다면 
				}			// j 는 3 임.
			}			
			arr[j+1] = temp;
		}System.out.println(Arrays.toString(arr));

		
	}
}
