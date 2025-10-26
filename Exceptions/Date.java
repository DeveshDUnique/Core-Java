package Exceptions;

public class Date 
{
    private int Day,Month,Year;


    public void setDay(int day)
    {
        if (day <1 || day >31)
        {
            throw new InvalidDateException("Day "+ day);         
        }
        this.Day = day;
    }

    public void setMonth(int month) 
    {
        if (month < 1 || month > 12)
        {

            throw new InvalidDateException("Month " + month);
        }
        this.Month = month;
    }

    public void setYear(int year)
    {
        if (year < 1970 || year > 2099)
        {

            throw new RuntimeException("Year should be between years 1970 and 2099",new InvalidDateException("year",year));
        }
        this.Year = year;
    }

    @Override
    public String toString()
    {
        return "Date [Day = " + Day + "Month = "+Month + "year = " + Year + "]";
    }
    
}
