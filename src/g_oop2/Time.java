package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	int cnts;
	int cntm;
	int cnth;
	
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second +1);
		}
	}
	
	//ctrl + 1 팝업창 뜸(오류창 편하게 보기)!!
	//사용자가 stop()을 알 필요가 없다. 그래서 private을 붙여서 안보이게 해준다.
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	//제한을 걸어두기 위해서 사용한다. 간접적으로 직접 변수를 주지 않고!
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(0<=hour && hour <24){
			this.hour = hour;			
		}else if(hour >23){
			this.hour =0;
		}
		//쌤
//		if(hour < 0){
//			this.hour = 0;
//		}else if(hour > 23){
//			this.hour = 23;
//		}else{
//			this.hour = hour;
//		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(0 <= minute && minute <=60){
			this.minute = minute;
		}
		if(this.minute > 59){
			setHour(hour+1);
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(0 <= second && second <60){
			this.second= second;
		}else if(second > 59){
			this.second = 0;
			setMinute(minute+1);
		}
	}
		
	//getter setter
}
