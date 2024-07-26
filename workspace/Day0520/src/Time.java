
public class Time {
	boolean am;
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
	}
	
	public int getHour() {
		return hour;
	}
	
	private void setHour(int hour2) {
		// 0~23사이
		// 오전 오후 판단
		// 12보다 작으면 am, 크면 오후
		// 12로 나눈 나머지로 hour 초기화
		if (hour >= 0 && hour <= 23) {
			this.am = hour < 12;
			this.hour = hour % 12;
			if (this.hour == 0) this.hour = 12;
		}
		else {
	this.hour = -9999;
		}
	}

	void whatTime() {
		System.out.println(am ? "오전" : "오후");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}

