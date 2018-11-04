package oct26;

public class SimpleTime {
	private int hour = 00;
	private int min = 00;
	private int sec = 00;

//bob the builder
	public SimpleTime(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

//gets&sets

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 00 && hour <= 23) {
			this.hour = hour;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min >= 00 && min <= 59) {
			this.min = min;
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec >= 00 && sec <= 59) {
			this.sec = sec;
		}
	}

//methods

	public void setTime(int hour, int min, int sec) {
		System.out.println("The Current time is: " + ":" + hour + ":" + min + ":" + "sec");
	}

public SimpleTime add(SimpleTime time){
	return time;
}
	public int addHour(int hour) {
		this.hour += hour;
		return hour;

	}

	public int addMin(int min) {
		this.min += min;
		return min;

	}

	public int addSec(int sec) {
		this.sec += sec;
		return sec;

	}

	public void addTick() {
		if (sec <= 59) {
			sec += 1;
		} else {
			hour++;
		}
	}

	public boolean equals(Object SimpleTime) {
		if (hour == this.getHour()) {
			if (min == this.getMin()) {
				if (sec == this.getSec()) {
					return true;
				}
			}
		}

		return false;
	}

	public String toString(Object SimpleTime) {
		System.out.println("The Time is:" + " " + hour + ":" + min + ":" + sec);
		return "Time";
	}

}
