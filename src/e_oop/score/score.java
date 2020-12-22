package e_oop.score;

import java.util.Arrays;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[10]; //null... 
		
//		Student student = new Student(); 위치 중요!! 요기선 학생 하나!! --- 문제점 하나의 학생이기에 밑에 for문 돌려서 값을 바꿔도 동일하게 다 바뀐다.
		for(int i = 0; i < students.length; i++){
//		Student student = new Student(); 위치 중요!! 요기선 학생 여러명!!!
			Student student = new Student();
			
			student.name = "학생" + (i+1);
			student.rank = 1;
			student.kor = (int)(Math.random()*101);
			student.eng = (int)(Math.random()*101);
			student.math = (int)(Math.random()*101);
			
			students[i] = student;
		}
		
	
		//성적관리 프로그램을 완성해 주세요.
		System.out.println("\t" + "국어" +"\t" + "영어" +"\t" + "수학"+"\t" +"합계" +"\t" + "평균" + "\t" +"석차");
		for(int i =0; i < students.length; i ++){
			Student student = new Student();
			
			student.name = "학생" + (i+1);
			student.rank = 1;
			student.kor = (int)(Math.random()*101);
			student.eng = (int)(Math.random()*101);
			student.math = (int)(Math.random()*101);
			student.sum = student.kor + student.eng +student.math;
			student.avg = Math.round((student.sum/3.0)*100)/100.0;
			students[i] = student;
			
		}
		students[0].name = "홍길동";
		students[0].sum = 1;
		System.out.println(Arrays.toString(students));
		Student arr = new Student();
//		arr.aaa[0] = "aaaa1";
//		arr.aaa[1] = "bbb";
//		arr.aaa[2] = "cccccc";
		arr.aa();
//		System.out.println(Arrays.toString(arr.aaa));
		//석차주기 
		for(int i =0; i < students.length; i ++){
			for(int j = 0; j < students.length; j ++){
				if(students[i].avg <students[j].avg){
					students[i].rank++;
				}
			}
		}
		
		//정렬
		for(int i = 0; i < students.length-1; i ++){
			int min = i;
			for (int j =i+1; j < students.length; j ++){
				if(students[min].rank > students[j].rank){
					min = j;
//					System.out.println(students[i].rank);
				}
			}
			Student temp = new Student();
			temp = students[i];
			students[i] = students[min];
			students[min ] = temp;
			
			// 출력
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].sum+"\t");
			System.out.print(students[i].avg+"\t");
			System.out.println(students[i].rank);
		}
		
		//과목별 합계 와 과목별 평균
		int korSum = 0;
		int engSum = 0;
		int mathSum =0;
		//sum
		for(int i =0; i < students.length; i ++){
			korSum += students[i].kor;
			engSum += students[i].eng;
			mathSum += students[i].math;
		}
		//avg
		double korAvg = (double)korSum / students.length;
		double engAvg = (double)engSum / students.length;
		double mathAvg = (double)mathSum / students.length;
		
		System.out.println("과목합계\t"+korSum + "\t" + engSum + "\t" + mathSum);
		System.out.println("과목평균\t"+korAvg + "\t" + engAvg + "\t" + mathAvg);
		
	}
}
