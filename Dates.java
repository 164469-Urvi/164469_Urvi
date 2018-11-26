
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;


public class Dates implements Comparator<Dates>{
int date,month,year;
	public Dates(int date, int month, int year) {
	this.date=date;
	this.month=month;
	this.year=year;
	
	}
	public int getDate()
	{
		return date;
	}
	public void setDate(int date){
		this.date=date;
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year=year;
	}
   public void getOutput(){
	   System.out.println(date+"/"+month+"/"+year);
   }
	public static void main(String[] args) {
		HashMap<Dates, String> hashmaps=new HashMap<Dates,String>();
		//Employee employee=new Employee();
		
		hashmaps.put(new Dates(9,8,1996),"Urvi");
		hashmaps.put(new Dates(10,10,1997),"Siddharth");
		hashmaps.put(new Dates(10,10,1998),"ravi");
		hashmaps.put(new Dates(31,12,1996), "Kajal");
		hashmaps.put(new Dates(2,8,1996),"Shweta");
		System.out.println(hashmaps);
		
          for(Entry<Dates, String> m:hashmaps.entrySet())
          {
        	 
        	  System.out.println(m.getKey().toString()+" "+m.getValue());
          }
   
}
	@Override
	public int compare(Dates d1, Dates d2) {
		if(d1.getDate()>d2.getDate())
		{ 
			return 1;
		}
		else if(d1.getDate()==d2.getDate() && d1.getMonth()==d2.getMonth())
		{
		  return 0;
		}
		else
		{
			return -1;
		}
		
	}
}