package oct26;

public class Alarm extends SimpleTime {

	private boolean isSet, isSnooze;
	private int snoozeTime;

	//gets&sets
	
	public boolean isSet() {
		return isSet;
	}

	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}

	public boolean isSnooze() {
		return isSnooze;
	}

	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}

	public int getSnoozeTime() {
		return snoozeTime;
	}

	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}
	
	//builder
	
	public Alarm(int hour, int min, int sec,boolean isSet,int snoozeTime,boolean isSnooze) {
		super(hour, min, sec);
		if(!isSet) {
		this.isSnooze=false;	
		this.isSet=false;
		}else {
		this.isSet=true;
		this.isSnooze=true;
		this.snoozeTime=snoozeTime;
		}
		
	}

	

}
