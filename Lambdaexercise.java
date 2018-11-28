
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Lambdaexercise {

	public static void main(String[] args) {
		Lambdaexercise lambdaexercise=new Lambdaexercise();
		List<Students> lists=Arrays.asList (
		new Students(1,"urvi"),
		new Students(2,"shweta"),
		new Students(3,"kajal")
		);
		
		Collections.sort(lists,new Comparator<Students>()
				{

					@Override
					public int compare(Students s1, Students s2) {
						return s1.getName().compareTo(s2.getName());
						
					}
			
				});
		printAll(lists);
		printlastnamewithc(lists);
	}
		private static void printlastnamewithc(List<Students> lists) {
	
		
	}
		private static void printAll(List<Students> lists)
		{
			for(Students s:lists)
			{  
				if(s.getName().startsWith("k"))
				{
					System.out.println(s);
				}
			
			}
		}
	}


