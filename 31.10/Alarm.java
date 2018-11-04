package oct26;

public class Alarm extends SimpleTime {

	private SimpleTime time;
	private boolean isSet = false, isSnooze = false;
	private int snoozeTime = 0;
	

	// gets&sets

	public SimpleTime getTime() {
		return time;
	}

	public void setTime(SimpleTime time) {
		this.time = time;
	}

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

	// builder

	public Alarm(int hour, int min, int sec, boolean isSet, int snoozeTime) {
		super(hour, min, sec);
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;

	}

	public Alarm(int hour, int min, int sec, SimpleTime time, boolean isSet) {
		super(hour, min, sec);
		this.time = time;
		this.isSet = isSet;
	}

	public void setAlarm() {

	}

}
