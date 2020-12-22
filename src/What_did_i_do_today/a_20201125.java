package What_did_i_do_today;

import java.util.Arrays;

class a_20201125 {
	public static void main(String[] args){
		/*
		 * 거스름돈에 동정의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		System.out.println("======Q1======");
		int[] coin = {500, 100, 50, 10};
		int money = (int)(Math.random()*500)*10;
		int cnt =0;
		System.out.println("거스름돈 : "+money+"원");
		for(int i = 0; i < coin.length; i ++){
			cnt = money/coin[i] ;
			money = money%coin[i];
			System.out.println(coin[i]+"원 : "+ cnt+"개");
		}
		
		System.out.println("======Q2======");
		System.out.println("======Q2======");
		System.out.println("======Q2======");
		/*
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 1: *** 3
		 * 2: **** 4
		 * 3: ** 2
		 * 4: ***** 5
		 * 5: * 1
		 */
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i ++){
			arr[i] = (int)(Math.random()*5)+1;
		}System.out.println(Arrays.toString(arr));
		// 1이 몇번 나오는지 2가 몇번 나오는지 알아보자
		int[] num = new int[5];
//		for(int i =0; i <arr.length; i ++){
//			num[arr[i]-1]++;
//		}
		for(int i =0; i < num.length; i ++){// 1 을 20번 돌릴꺼다.
			cnt = 0;
			System.out.print(i+1+" : ");
			for(int j = 0; j < arr.length; j++){
				if( i+1 == arr[j]){
					num[i]++;
					System.out.print("*");
				}
			}
			System.out.println("   "+num[i]+"개");
		}
		
		
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장되 배열에서 중복된 값이 제거된 배열을 만들어 주세요.
		 * 단, 한개씩은 남겨두고 정렬하기.
		 */
		System.out.println("======Q3======");
		System.out.println("======Q3======");
		System.out.println("======Q3======");
		arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		num = new int [10];
		int index = 0;
		int cntt = 0;
		// i를 10번 씩 검사. (단, 자기 자신은 제외해야 한다!)
		for(int i =0; i < arr.length;i++){ // arr - index 0 의 값을 
			boolean a = false;
			for(int j =0; j < arr.length; j++){	// num 10번 돌리면서 중복된 값이 있는지 확인한다..
				if (arr[i] == num[j]){ // 중복된 값이 있으면 true return
					a = true;
				}
			}
			if(!a){
				cntt++;
				num[index++] = arr[i];
			}
		}System.out.println(Arrays.toString(num));
		System.out.println(cntt);
		//정렬시키기
		int temp= 0;
		for(int i =0; i < index-1; i++){
			if(num[i] > num[i+1]){
				temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
			}
		}System.out.println(Arrays.toString(num));
		//뒤에 0 없애기
		int[] q3_result = new int[cntt];
		for(int i = 0; i < cntt; i ++){
			q3_result[i] = num[i];
		}System.out.println(Arrays.toString(q3_result));
		
		
		/*
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5, 10, 15, 20, 35...]
		 * 
		 */
		System.out.println("======Q4======");
		System.out.println("======Q4======");
		System.out.println("======Q4======");
		//나누어 떨어지는 배열
		arr = new int[100];
		for(int i =0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100)+1;
		}
		int random = (int)(Math.random() * 4)+2;
		
		random = 2;
		// 1. arr[i] % random == 0
		// 2. 값 넣기
		// 3. 정렬시키기
		int count = 0;
		// 배열 길이 구하기
		for(int i = 0; i < arr.length; i++ ){ 
			if(arr[i] % random == 0){
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		int[] arr1 = new int[count];
		index = 0;
		// index i 의 값을 2로 나눴을때 나머지가 0인 수를 구해서
		for(int i =0; i < arr.length; i ++){  
			boolean a = false;
			if(arr[i] % random == 0){
				arr1[index++] = arr[i]; //값 넣기
			}
		}System.out.println(Arrays.toString(arr1));
		
		//정렬시키기
		temp = 0;
		for(int i =0; i < arr1.length; i ++){
			for(int j = 0; j < arr1.length-1; j++ ){
				if(arr1[i] < arr1[j]){
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}System.out.println(Arrays.toString(arr1));
		
		//중복된 숫자 삭제 한개는 남겨야
		int[] arr2 = new int[index];
		index = 0;
		count =0;
		for(int i = 0; i < arr1.length; i ++){		// index i 의 값을
			boolean a = false;
			for(int j =0; j < arr2.length; j ++){	//	index j 들로 비교하기
				if(i != j && arr1[i] == arr2[j]){
					a = true;
				}
			}
			if(!a){
				arr2[index++] = arr1[i];
				count++;
			}
		}System.out.println(Arrays.toString(arr2)+"======== 중복검사");
		
		//그 후 뒤의 000 삭제하기
		int[] arr3 = new int[count];
		for(int i = 0; i < arr3.length; i ++){
			arr3[i] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	}
}
