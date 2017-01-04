
public class Date {
	int month;
	int day;
	int year;
	public Date(int NewMonth,int NewDay,int NewYear){
		month=NewMonth;
		day = NewDay;
		year=NewYear;
	}
	public void setMonth(int newMonth){
		month=newMonth;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int newDay)
	{
		day=newDay;
	}
	public int getDay()
	{
		return day;
	}
	public void setYear(int newYear)
	{
		year=newYear;
	}
	public int getYear(){
		return year;
	}
	public static void main(String[] args) {
		Date date=new Date(1,3,17);
		System.out.printf("%d/%d/%d",date.getMonth(),date.getDay(),date.getYear());

	}

}
