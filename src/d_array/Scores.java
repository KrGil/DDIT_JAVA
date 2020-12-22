package d_array;

import java.util.Arrays;

public class Scores {
	public static void main(String[] args){
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100까지 랜덤으로 생성해 주고, 아래와 같이 출력해 주새요.
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450		
		 * 과목평균	90.00	90.00	90.00
		 * 
		 */
		
		
		double[][] back_end = new double[25][10];
		String[] name = {"정지수", "송수미","이현기","진예은","윤지혜","양지수", "정이삭","김도윤", "박세연","김보현",
							"오세일","원정훈", "장병길","문선준", "배수진","진유리","김지훈","김동익","임태준","이진수",
							"최희수","박초원","전형섭","김보미","김혜정"};
		//점수 랜덤점수 넣기
		String sub = "\t국어"+"\t영어"+"\t수학"+"\t사회"+"\t과학"+"\tOracle"+"\tJava"+"\t합계"+"\t평균"+"\t석차";
		System.out.println(sub);
		int[] sum = new int [25];
		double[] avg = new double [25];
		double[] avg_g = new double [25];
		int[] rank_g = new int [25];
		
		// 랜덤값 부여.b
		
		for(int i =0; i < back_end.length; i ++){
			for(int j =0;  j < back_end[i].length-3; j ++){
				back_end[i][j] = (int)((Math.random()*101)-10)+10; // 0~101 점수 부여하기
				sum[i] += back_end[i][j];
			}
			for(int j = 7; j < 9; j++){
				back_end[i][j] = sum[i];
			}
			avg[i] = sum[i] / (7.0);
			for(int j = 8; j < 9; j++){
				back_end[i][j] =avg[i];
			}
			System.out.print(name[i]+ "  ");
			System.out.println(Arrays.toString(back_end[i]) + "    sum :  " + sum[i] + "   avg :  "+avg[i] +" 과목수: "+(back_end[i].length-3));
		}
		
		
		// 석차   
		//index 8(평균)을 뽑고 그 평균을 담아보자.
		for(int i = 0; i < back_end.length; i ++){
			for(int j =8; j < 9; j++){
//				System.out.println((back_end[i][j]));
				avg_g[i] = back_end[i][j];
			}
		}
//		System.out.println(Arrays.toString(avg_g));
		//평균의 등수들을 담아보자.
		for(int i = 0; i < back_end.length; i ++){
			int count = 1;
			for(int j = 0; j < avg_g.length; j ++){
				if(avg_g[i] < avg_g[j]){
					count++;
				}
			}
			rank_g[i] = count;
//			System.out.println(Arrays.toString(rank_g));
		}
		// 등수를 이제 원래 배열에 담아보자
		for(int i = 0; i < back_end.length; i ++){
			for(int j =9; j < 10; j++){
				back_end[i][j] = rank_g[i];
			System.out.print((back_end[i][j]));
			}
			System.out.println();
		}
		
		// 과목합계와 과목평균을 구하자
		int[] sub_sum = new int[7];
		double[] sub_avg = new double[7];
		for(int i = 0; i < 7; i ++){
			int sub_sum1 = 0;
			for(int j = 0; j < 25; j ++){
				sub_sum1 += back_end[j][i];
			}
			sub_sum[i] = sub_sum1;
			sub_avg[i] = Math.round((sub_sum[i] / 25.0)*100)/100.0;
		}
		//정렬하기
		for(int i = 0; i < rank_g.length-1; i++){
			boolean a = false;
			for(int j =0; j < rank_g.length-i-1; j ++){
				if(rank_g[j] > rank_g[j+1]){
					int temp = rank_g[j];
					rank_g[j] = rank_g[j+1];
					rank_g[j+1] = temp;
					
					double[] tempa = back_end[j];
					back_end[j] = back_end[j+1];
					back_end[j+1] = tempa;
					
					String c = name[j];
					name[j] = name[j+1];
					name[j+1] = c;
					a = true;
				}
			}
			if(!a){
				break;
			}
		}
		
		//출력하기
		System.out.println(sub);
		for(int i = 0; i < back_end.length; i ++){
			System.out.print(name[i]+ "\t");
			for(int j =0; j < back_end[i].length ; j++){
				if(j == 8){
					System.out.print(Math.round((back_end[i][j])*100)/100.0 + "\t");
				}else{
					System.out.print(Math.round((back_end[i][j])) + "\t");
				}
			}
			System.out.println();
		}
		System.out.print("과목합계\t");
		for(int i = 0; i < sub_sum.length; i ++){
			System.out.print((sub_sum[i])+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for(int i = 0; i < sub_sum.length; i ++){
			System.out.print((sub_avg[i])+"\t");
		}
//		System.out.println(Arrays.toString(rank_g));
		
	}
}
