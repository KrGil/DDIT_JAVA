package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//거스름돈 동전 갯수
		int[] coin = {500, 100, 50, 10};
		int money = (int)(Math.random()*500)*10;
		
		/*
		 * 거스름돈에 동정의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 * 
		 */
		int[] a = new int[coin.length];
		//내가한것
		
//		System.out.println("거스름돈 : "+ money);
//		for(int i =0; i < coin.length; i ++){
//			int cnt = 0;
//			while(cnt < money/coin[i]){cnt ++;}
//			money = money - (coin[i]*(cnt));
//			a[i] = cnt;
//			System.out.println(coin[i]+"원 : "+a[i]+"개");
//		}
		
		//쌤이한것
		
//		System.out.println(coin[0] +"원 : "+money / coin[0] + "개");
//		money = money % coin[0];
//		for(int i = 0; i < coin.length; i++){
//			System.out.println(coin[0] +"원 : "+money / coin[0] + "개");
//			money = money % coin[i];
//		}
		
		//그래프 그리가
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i ++){
			arr[i] = (int)(Math.random()*5)+1;
		}
//		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 1: *** 3
		 * 2: **** 4
		 * 3: ** 2
		 * 4: ***** 5
		 * 5: * 1
		 * 
		 */
		//나
//		int [] check = {0,0,0,0,0};
//		for(int i = 0; i <arr.length; i ++){
//			for (int j = 0; j < arr.length; j++){
//				if (arr[i] == j+1){
//					check[j]++;
//				}
//			}
//			System.out.println(Arrays.toString(check));
//		}

		//쌤
//		int[] count = new int[5];
//		for(int i = 0; i < arr.length; i++){
//			count[arr[i] - 1]++; //count는 인덱스 0 부터 {0,0,0,0,0} arr[i]의 값이 4이면 -1해서 count 인덱스 3에 추가!
//		}
//		for(int i =0; i < count.length; i++){
//			System.out.print(i+1+" : ");
//			for(int j = 0; j < count[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println(" "+count[i]);
//		}
		
		arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장되 배열에서 중복된 값이 제거된 배열을 만들어 주세요.
		 */
		//내가 한것
//		int[] count = new int[10];
//		//중복되는 숫자 찾기
//		for(int i =0; i < arr.length; i ++){			
//			boolean b = false;
//			int cnttt = 0;
//			for(int j = 0; j < arr.length; j ++){ //자신과 그 외의 숫자 모두를 비교
//				if(i != j && arr[i] == arr[j]){ // 만약 자기자신이 아니고 자신과 같으면 
//					b =true;					// b 는 true 하고 빠져나오기.
//					cnttt++;
//					break;
//				}
//			}
//			if(!b){	count[i] = arr[i];	}	//false 이면 count리스트에 중복되지 않은 숫자 넣기
//		}
//		System.out.println(Arrays.toString(count));
//		System.out.print("중복되는 숫자는 = ");
//		
//		// 중복되지 않은 숫자 다시 담기 // 000을 없애서 다시 담기
//		int cnt=0;
//		for(int i = 0; i < count.length; i++){	// result의 범위를 주기 위해 자리수 세기
//			if(count[i] != 0)cnt++;
//		}
//		int[] result = new int[cnt];
//		cnt=0;
//		for(int i = 0; i < count.length; i++){		//result에다가 다시 담기
//			if(count[i] != 0){cnt++;
//				result[cnt-1] = count[i];
//				System.out.print("count["+i+"]의 "+count[i]+" ");
//			}
//		}System.out.println(Arrays.toString(result));
//		if(cnt ==0){	System.out.println("모두 중복된다.");	}
//		else{//정렬 다시 해주기
//			int temp =0;
//			for(int i =0; i < result.length; i ++){
//				for(int j = 0; j <result.length-i-1; j ++){
//					if(result[j] > result[j+1]){
//						temp = result[j];
//						result[j] = result[j+1];
//						result[j+1] = temp;
//					}
//				}
//			}System.out.println(Arrays.toString(result));	
//		}
//		
		int[] temp = new int[5];
//		int count = 0;
//		for(int i =0; i < arr.length; i ++){
//			for(int j =0; j < temp.length; j++){
//				for(int u = 0; u < temp.length; u++){
//					System.out.println("i = "+i+"   j = "+j+"   u = "+u);
////					System.out.println(j);
//					if(arr[i] != temp[j] && temp[j] != temp[u]){
//						System.out.println("arr["+i+"] = "+arr[i] + "   temp["+j+"] = "+temp[j]);
//						temp[j] = arr[i];
//						System.out.println(Arrays.toString(temp));
//						count++;
//						break;
//					}
//					
//				}
//			}
//		}System.out.println(Arrays.toString(temp));
		
		//쌤껄로!!
//		int index = 0;
//		for(int i =0; i < arr.length; i ++){
//			boolean flag = false;
//			for(int j=0; j <temp.length; j++){
//				if(arr[i] == temp[j]){
//					flag = true;
//				}
//			}
//			if(!flag){
//				temp[index++] = arr[i];
//			}
//		}System.out.println(Arrays.toString(temp));
//		
//		//5개보다 작은 배열 새로 만들어서 값 주기!!
//		int[] ans = new int[index];
//		for (int i =0; i < ans.length; i ++){
//			ans[i] = temp[i];
//		}System.out.println(Arrays.toString(ans));
//		

		//나누어 떨어지는 배열
		arr = new int[100];
		for(int i =0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100)+1;
		}
		int random = (int)(Math.random() * 4)+2;
		
		/*
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5, 10, 15, 20, 35...]
		 * 
		 */
		System.out.println(Arrays.toString(arr));
		
		//arr[i] % random ==0 ----> result[i++]에 저장
		System.out.println(random);
		
		// 해당 수가 나누어 떨어지는 수 들만 모으기
		int index  =0;
		int count = 0;
		int[] pre_result = new int[arr.length];
		for ( int i = 0; i < arr.length; i ++){
			boolean c = false;			
			if( arr[i] % random != 0 ){
				c = true;
				count ++;
			}
			if(!c){
				pre_result[index++] = arr[i];
			}
		}System.out.println(Arrays.toString(pre_result));
		
		//뒤에있는 000들을 없애자
		int[] result = new int[index];
		for(int i =0; i < index; i ++){
			result[i] = pre_result[i];
		}System.out.println(Arrays.toString(result)+"  ---뒤에 0들 없애기");
		//정렬하기  버블 정렬
		int temp1 = 0;
		for (int i =0; i < result.length; i ++){
			for(int j = 0; j < result.length-i-1; j ++){
				if(result[j] > result[j+1]){
					temp1 = result[j];
					result[j] = result[j+1];
					result[j+1] = temp1;
				}
			}
		}System.out.println(Arrays.toString(result)+"  ---정렬하기");
		
		//중복된거 말고 한개만 하라
		int[] result1 = new int[result.length];
		int index1 = 0;
		for( int i = 0; i < result.length; i ++){
			boolean d = false;
			for(int j = 0; j< result1.length; j++){
				if(result[i]==result1[j]){
					d = true;
				}
			}
			if(!d){
				result1[index1++] = result[i];
			}
		}System.out.println(Arrays.toString(result1)+"  ---중복되면 한 숫자만");
		int [] result2 = new int [index1];
		for(int i = 0; i <result2.length; i ++){
			result2[i] = result1[i];
		}System.out.println(Arrays.toString(result2)+"   ---뒤에 0들 없애기");
		
		
		
		// 쌤
		int n = (int)(Math.random()*4)+1;
		temp = new int[100];
		index = 0;
		for(int i =0; i < arr.length; i ++){
			if(arr[i]%n ==0){
				temp[index++] = arr[i];
			}
		}System.out.println(Arrays.toString(temp));
		
		arr = new int[index];
		for(int i = 0; i <arr.length; i ++){
			arr[i] = temp[i];
		}System.out.println(Arrays.toString(arr));
		//선택정렬 - 맨 앞으로(자동으로 좌측정렬시키면서 뒤로감)
		for(int i = 0; i < arr.length - 1; i ++){
			int min = i;
			for(int j = i+1; j< arr.length; j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		System.out.println("n : " + n);
		System.out.println(Arrays.toString(arr));
		
	}

}
