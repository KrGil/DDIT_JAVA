package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다차원 배열
		 * 	- 배열 안에 배열이 저장되어 있는 형태이다.
		 * 
		 */
		
		//2차원 배열
		int[][] array2;
		
		//3차원 배열
		int[][][] array3;
		
		//2차원
		int[][] arr = new int[2][3]; //2칸짜리 배열 안에 각 칸마다 3칸짜리 배열이 생성된다.
		/*
		 * {주소1, 주소2}
		 * 
		 * 주소1
		 * {0,0,0}
		 * 
		 * 주소2
		 * {0,0,0}
		 */
		int arr1[][] = new int[][]{ {1,2,3}, {4,5,6,} };
		//값의 개수로 배열의 길이가 정해진다.
		int[][] arr2 = { {1,2,3}, {4,5,6,} };
		
		int[] arry3[] = { {1,2,3} 
						, {4,5,6} 
						, {7,8,9} };
		
		int[][] arr4 = new int[3][]; // 가변 배열 
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		System.out.println(arr[0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[1][2]);
		
//		arr[0] = 10; // 1차원에는 값을 저장할 수 없다.( 주소가 저장된다. )
		arr[0] = new int[5]; // 1차원에는 배열을 저장해야 한다.
		arr[0][0] = 10; // 2차원까지 접근해야 값을 저장할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); // 2차원 배열의 길이
		System.out.println(arr[1].length); // 2차원 배열의 길이
		
		//2차원 배열에 접근하기 위해서는 for문이 두개 필요하다.
		//1차원
		for(int i =0; i < arr.length; i ++){
			//2차원
			for(int j = 0; j < arr[i].length; j ++){
				System.out.println(i+","+j+" : "+arr[i][j]);
			}
		}
		
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		//학생 각각의 합계와 평균을 구하라. 
		int [] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		for(int i = 0; i < scores.length; i ++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() *101);//0~100점
				sum[i] += scores[i][j];
			}
			System.out.println(i+" : "+Arrays.toString(scores[i]));
			avg[i]= sum[i]/scores[i].length;
			System.out.println("합계 : "+sum[i]+" / 평균 : "+avg[i]);
		}
		System.out.println("합계 : "+Arrays.toString(sum)+" / 평균 : "+Arrays.toString(avg));
		System.out.println();
		
		//합계와 평균을 구해주세요. 쌤
		for(int i =0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j ++){
				sum[i] += scores[i][j];
			}
			avg[i]= sum[i]/scores[i].length;
			System.out.println("합계 : "+sum[i]+" / 평균 : "+avg[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
