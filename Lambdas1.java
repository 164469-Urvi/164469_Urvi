import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Lambdas1 {
 public static void main(String[] args) {
	List<Students> listing=Arrays.asList(new Students(4,"urvi"),new Students(5,"Urvashi"),new Students(9,"kajal"));
	Collections.sort(listing,(Students s1,Students s2) -> s1.getName().compareTo(s2.getName()));
	performCondtionally(listing,p-> true);
	performCondtionally(listing,p-> p.getName().startsWith("k"));
	performCondtionally(listing,p->p.getName().endsWith("l"));
}

private static void performCondtionally(List<Students> listing,Predicate<Students> students) {
	for(Students s:listing)
	{
		if(students.test(s))
		{
		System.out.println(s);
	}
	
}
 
	 
}
}