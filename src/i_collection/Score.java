package i_collection;

import java.util.ArrayList;

public class Score {
	//2차원 ArrayList 사용해서 점수 만들기
	//우리반 모두의 국어, 영어, 수학 , 사회, 과학 , Oracle, Java 점수를
	//0~100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
	public static void main(String[] args) {
		ArrayList<String> sub = new ArrayList<>();
		ArrayList<Integer>s_name = new ArrayList<>();
		ArrayList< ArrayList<Integer> >t_s_score = new ArrayList<>();
		ArrayList<Integer> s_score = new ArrayList<>();
		int random =0;
		sub.add("국어");
		sub.add("영어");
		sub.add("수학");
		sub.add("사회");
		sub.add("과학");
		sub.add("Oracle");
		sub.add("Java");
		
		// 학생 이름 넣기
		for(int i =1; i < 25; i ++){
			s_name.add(i);
			System.out.println(s_name.get(i-1));
		}
		// 랜덤 점수 넣기(학생마다, 과목별)
		for(int j = 0; j < 24; j ++){
			s_score = new ArrayList<>();
			for(int i = 0; i < sub.size(); i ++){
				random = (int)((Math.random()*100)+1);
				s_score.add(random);
				System.out.println(s_score);
			}
			System.out.println();
			t_s_score.add(s_score);
		}
		System.out.println(t_s_score);
		//과목합계
		ArrayList<Integer> sub_sum = new ArrayList<>();
		ArrayList<Double> sub_avg = new ArrayList<>();
		for(int k = 0; k < sub.size(); k++){
			int sum=0;
			for(int i = 0; i < s_name.size(); i ++){
				ArrayList<Integer> tempi = t_s_score.get(i);
				for(int j = 0; j < 1; j ++){
					sum += tempi.get(k);
					System.out.println(sum);
				}
			}
			sub_sum.add(sum);
			sub_avg.add(Math.round((double)sum/s_name.size()*100)/100.0);
			System.out.println(sub_sum);
			System.out.println(sub_avg);
		}
		//학생별 합계 및 평균
		int sum =0;
		double avg = 0;
		ArrayList <Double> name_avg = new ArrayList<>();
		ArrayList <Integer> name_sum = new ArrayList<>();
		for(int i =0; i < s_name.size(); i++){
			System.out.print(s_name.get(i)+"\t");
			ArrayList <Integer> tempj = t_s_score.get(i);
			sum = 0;
			for(int j = 0; j < tempj.size(); j ++ ){
				//학생별 합계 및 평균
				sum += tempj.get(j);
			}
			avg = Math.round((double)sum/sub.size()*100)/100.0;
			name_sum.add(sum);
			name_avg.add(avg);
			System.out.println(avg);
		}
		//석차 구하기
		ArrayList<Integer> rank = new ArrayList<>();
		int cnt=1;
		for(int i = 0; i< name_avg.size(); i++){
			cnt = 1;
			for(int j =0; j < name_avg.size(); j ++){
				if(name_avg.get(i) < name_avg.get(j)){
					cnt++;
					System.out.println("cnt_ "+cnt);
				}
			}
			rank.add(cnt);
		}
		System.out.println(rank);
		
		//정렬하기
		int min = 0;
		for(int i = 0; i < rank.size()-1; i ++){
			min = i;
			for(int j = i+1; j < rank.size(); j ++){
				if(rank.get(min) > rank.get(j)){
					min =j;
				}
			}
			//rank 정렬
			int temp = rank.get(min);
			rank.set(min, rank.get(i));
			rank.set(i, temp);
			//과목 정렬
//			for(int k = 0; k < t_s_score.size(); k++){
				ArrayList<Integer> temp1 = t_s_score.get(min);
				t_s_score.set(min, t_s_score.get(i));
				t_s_score.set(i, temp1);
				
//			}
			//이름 정렬
			int temp2 = s_name.get(min);
			s_name.set(min, s_name.get(i));
			s_name.set(i,temp2);
		}
		System.out.println(rank);
		
//		출력하기
//		과목출력
		System.out.print("\t");
		for(int i = 0; i < sub.size(); i++){
			System.out.print(sub.get(i) + "\t");
		}
		System.out.println("합계" + "\t" + "평균" + "\t"+"석차");
		//성적출력
		for(int i =0; i < s_name.size(); i++){
			System.out.print(s_name.get(i)+"\t");
			ArrayList <Integer> tempj = t_s_score.get(i);
			sum = 0;
			for(int j = 0; j < tempj.size(); j ++ ){
				//학생별 합계 및 평균 출력
				System.out.print(tempj.get(j)+"\t");
				sum += tempj.get(j);
			}
			//석차 출력하기
//			System.out.print(sum + "\t" + Math.round((double)sum/sub.size()*100)/100.0);
			System.out.print(sum + "\t" + name_avg.get(i)+"\t" + rank.get(i));
			
			System.out.println();
		}
		
		//합계출력
		System.out.print("과목합계"+"\t");
		for(int i = 0; i < sub_sum.size(); i ++){
			System.out.print(sub_sum.get(i)+"\t");
		}System.out.println();
		//평균출력
		System.out.print("과목평균"+"\t");
		for(int i = 0; i < sub_sum.size(); i ++){
			
			System.out.print(sub_avg.get(i)+"\t");
		}
		
		
	}
}
