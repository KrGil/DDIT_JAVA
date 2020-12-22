package What_did_i_do_today;

import java.util.Arrays;

public class a_20201126_scores {
	public static void main(String[] args){
//				국어	영어	수학	사회	과학	Oracle	Java합계	평균	석차
//		박초원	38	100	70	80	94	85	1	468	66.86	1	
//		김도윤	80	65	45	100	71	28	78	467	66.71	2	
//		배수진	48	64	41	14	82	88	82	419	59.86	3	
//		정지수	57	90	84	25	63	19	76	414	59.14	4	
//		진예은	96	92	22	30	17	56	81	394	56.29	5	
//		김보미	86	91	62	27	40	75	10	391	55.86	6	
//		장병길	94	36	86	16	95	31	32	390	55.71	7	
//		이현기	43	21	81	51	80	37	74	387	55.29	8	
//		원정훈	30	51	89	15	79	81	40	385	55.0	9	
//		김동익	43	71	8	96	93	50	10	371	53.0	10	
//		문선준	11	38	79	65	66	80	31	370	52.86	11	
//		임태준	98	17	79	28	26	94	26	368	52.57	12	
//		진유리	34	50	85	41	18	69	64	361	51.57	13	
//		최희수	52	90	21	68	34	11	84	360	51.43	14	
//		김혜정	57	75	50	36	46	50	43	357	51.0	15	
//		이진수	52	94	39	26	73	10	43	337	48.14	16	
//		김보현	72	44	17	45	29	97	5	309	44.14	17	
//		양지수	2	40	90	9	75	7	69	292	41.71	18	
//		정이삭	86	31	10	26	11	19	96	279	39.86	19	
//		박세연	27	6	93	41	22	73	11	273	39.0	20	
//		오세일	27	22	79	28	55	20	33	264	37.71	21	
//		송수미	35	2	87	1	41	27	62	255	36.43	22	
//		전형섭	86	40	30	10	2	78	4	250	35.71	23	
//		김지훈	24	1	36	6	51	22	99	239	34.14	24	
//		윤지혜	43	3	10	75	36	35	33	235	33.57	25	
//		과목합계	1321	1234	1393	959	1299	1242	1187	
//		과목평균	52.84	49.36	55.72	38.36	51.96	49.68	47.48	
		//처럼 만들기
		
		//1. 배열 만들기(클래스 )
		int [][] classmate = new int[25][7];
		int [] sum = new int[25];
		double [] avg = new double[25];
		int [] sub_sum = new int[7];
		double [] sub_avg = new double[7];
		int [] rank = new int[25];
		//2. name에 이름 부여하기
		String [] sub = {"국어",	"영어","수학","사회","과학","Oracle","Java","합계","평균","석차"};
		String [] name = {"정지수", "송수미","이현기","진예은","윤지혜","양지수", "정이삭","김도윤", "박세연","김보현",
				"오세일","원정훈", "장병길","문선준", "배수진","진유리","김지훈","김동익","임태준","이진수",
				"최희수","박초원","전형섭","김보미","김혜정"};
		//2. classmate에 랜덤 점수 배분하기.
		for(int i =0; i < classmate.length; i ++){
			for(int j =0; j < classmate[i].length; j ++){
				classmate[i][j] = (int)
						(Math.random()*101)+1;
				sum[i] += classmate[i][j]; //합계 구하기
				avg[i] = Math.round((sum[i] / 7.0)*100)/100.0; //평균 구하기
			}
			for(int q= 0; q < sub_sum.length; q ++){
				sub_sum[q] += classmate[i][q]; //과목합계 구하기
				sub_avg[q] =Math.round((sub_sum[q] / 25.0)*100)/100.0; // 과목평균 구하기
			}
			System.out.println((Arrays.toString(classmate[i])+" "+ sum[i]+" "+avg[i]));
		}
		System.out.println(Arrays.toString(sub_sum));
		System.out.println(Arrays.toString(sub_avg));
		//3. 석차 구하기
		
		for(int i = 0; i< rank.length; i ++){
			rank[i]++;
			for(int j = 0 ; j < rank.length; j ++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}System.out.println(Arrays.toString(rank));
		
		//정렬
		for(int i =0; i < rank.length-1; i ++){
			boolean a = false;
			for (int j = 0; j < rank.length-i-1; j ++){
				if(avg[j]<avg[j+1]){
					int temp = rank[j];
					rank[j] = rank[j+1];
					rank[j+1] = temp;
					a = true;
					double tempa = avg[j];
					avg[j] = avg[j+1];
					avg[j+1] = tempa;
					for(int u = 0; u < classmate[i].length; u++){
						int tempb = classmate[i][u];
						classmate[i][u] = classmate[i+1][u];
						classmate[i+1][u] = tempb;						
					}
					String tempc = name[j];
					name[j] = name[j+1];
					name[j+1] = tempc;
				}
			}
			if(!a){
				break;
			}
		}
		// 출력하기
			System.out.print("\t");
			for(int i=0; i < sub.length; i ++){
				System.out.print(sub[i]+"\t"); // 과목명 출력하기
			}
			System.out.println();
			for(int i =0; i< classmate.length; i ++){
				System.out.print(name[i]+"\t"); //이름 출력
				for(int j =0; j < classmate[i].length; j ++){
					System.out.print(classmate[i][j]+"\t"); // 점수 출력
				}
					System.out.print(+sum[i]+"\t"+avg[i]+"\t"+rank[i]);
					System.out.println();
			}
			System.out.print("과목 합계"+"\t");
			for(int i=0; i < sub_sum.length; i ++){
				System.out.print(sub_sum[i]+"\t"); // 과목명 출력하기
			}
			System.out.println();
			System.out.print("과목 평균"+"\t");
			for(int i=0; i < sub_sum.length; i ++){
				System.out.print(sub_avg[i]+"\t"); // 과목명 출력하기
			}
	}
}