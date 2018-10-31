package oct26;

public class SimpleTime {
	private int hour = 0;
	private int min = 0;
	private int sec = 0;

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
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min >= 0 && min <= 59) {
			this.min = min;
		}
	}

	public int getSec() {
		return sec;
	}

public void setSec(int sec) {
	if(sec>=0&&sec<=59) {
	this.sec = sec;
	}
}


//methods

public void setTime(int hour,int min,int sec) {
	System.out.println("The Current time is: "+":"+hour+":"+min+":"+"sec");
}
public int addHour(int hour) {
	this.hour+=hour;
	return hour;
	
}
public int addMin(int min) {
	this.min+=min;
	return min;
	
}
public int addSec(int sec) {
	this.sec+=sec;
	return sec;
	
}
public void addTick() {
	sec+=1;
}

public boolean equals (Object SimpleTime) {
	if(this.hour==hour) {
		if(this.min==min)
			if(this.sec==sec)
				return true;
	}
	return false;
}

public String toString(Object SimpleTime) {
	System.out.println("The Time is:"+"  "+hour+":"+min+":"+sec);
	return "printed";
}

}
