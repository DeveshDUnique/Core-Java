package Exceptions;

public class Time 
{
	private int hours;
	private int minutes;
	private int seconds;

	public void setHours(int hours) throws InvalidTimeException 
	{
		if (hours < 0 || hours >= 24)
			throw new InvalidTimeException("hours",hours,"hours should be between 0 and 24 ");
		this.hours = hours;
	}

	public void setMinutes(int minutes) throws InvalidTimeException 
	{
		if (minutes < 0 || minutes >= 60)
			throw new InvalidTimeException("minutes", minutes,"minutes should be between 0 and 60");
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) throws InvalidTimeException 
	{
		if(seconds<0 || seconds>=60)
			throw new InvalidTimeException("seconds",seconds,"seconds should be 0 to 59");
		this.seconds = seconds;
	}

	@Override
	public String toString() 
	{
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
