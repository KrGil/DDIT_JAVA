package d_array;

public class Scores_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"1", "2", "3", "4","5","6"};
		String[] subjects = {"국어",	"영어","수학","사회","과학","Oracle","Java"};
		int[][] score = new int[names.length][subjects.length];
		
		for(int i = 0; i < score.length; i ++){
			for(int j = 0; j < score[i].length; j ++){
				score[i][j] = (int)(Math.random()*101);
			}
		}
		
		int[] nameSum = new int[score.length];
		for(int i = 0; i < score.length; i ++){
			for(int j = 0; j < score[i].length; j ++){
				nameSum[i] += score[i][j];
			}
		}
		
		double[] nameAvg = new double[score.length];
		
		for(int i =0; i < score.length; i ++){
			nameAvg[i] = Math.round((double)nameSum[i]/subjects.length*100)/100.0;
		}
		
		int[] subSum = new int[subjects.length];
		
		for(int i =0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j ++){
				subSum[i] += score[j][i];
			}
		}
		double[] subAvg = new double[subjects.length];
		
		for(int i =0; i < subjects.length; i ++){
			subAvg[i] = Math.round((double)subSum[i]/score.length*100)/100.0;
		}
		
		int[] rank = new int[score.length];
		
		for(int i = 0; i < nameSum.length; i++){
			rank[i] = 1;
			for(int j = 0; j < nameSum.length; j ++){
				if(nameSum[i] < nameSum[j]){
					rank[i]++;
				}
			}
		}
		for (int i =0; i < subjects.length; i ++){
			System.out.print("\t" +subjects[i]);
		}
		System.out.println("\t"+"합계"+"\t"+"평균"+"\t"+"석차");
	}
}
