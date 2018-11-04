package oct26;

public class AlarmClock extends Alarm {
	private ExtendedTime currentTime;
	private int alarmTime = 5;

//gets&sets

	public ExtendedTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(ExtendedTime currentTime) {
		this.currentTime = currentTime;
	}

	public int getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(int alarmTime) {
		this.alarmTime = alarmTime;
	}

	// builder
	public AlarmClock(int hour, int min, int sec, boolean isSet, int snoozeTime) {
		super(hour, min, sec, isSet, snoozeTime);
	}

	public AlarmClock(int hour, int min, int sec, boolean isSet, int snoozeTime, ExtendedTime currentTime,
			int alarmTime) {
		super(hour, min, sec, isSet, snoozeTime);
		this.currentTime = currentTime;
		this.alarmTime = alarmTime;
	}

	public void setAlarm(int AlarmTime, int hour, int min, int sec, boolean is24Hours) {

	}

	public SimpleTime setAlarm(int hour, int min, int sec) {
		return currentTime;

	}
}
