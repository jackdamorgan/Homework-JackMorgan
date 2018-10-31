package oct26;

public class ExtendedTime extends SimpleTime {

	private boolean is24Hours;

	// gets&sets

	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	// builder

	public ExtendedTime(int hour, int min, int sec,boolean is24Hours) {
		super(hour, min, sec);
		if(!is24Hours) {
		}else if(hour<12){
		}else {
			this.hour=hour;
		}
	}
	
	public String toString(Object ExtendedTime) {
		System.out.println("The Time is:"+"  "+getHour()+":"+getMin()+":"+getSec());
		return "printed";
		
	}

}
