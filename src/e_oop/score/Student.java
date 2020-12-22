package e_oop.score;

public class Student {
	int kor;
	int eng;
	int math;
	int sum = kor+eng+math;
	double avg = sum/3.0;
	String name;
	int rank;
	String[] aaa;
	
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sum=" + sum + ", avg=" + avg + ", name=" + name
				+ ", rank=" + rank + "]";
	}

	public static void aa(){
		System.out.println("나는 할 수 있다.");
	}
}
