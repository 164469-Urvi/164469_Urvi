import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class DescendingArray {

	public static void main(String[] args) {
     ArrayList<Integer> arrays=new ArrayList<Integer>();
     arrays.add(100);
     arrays.add(120);
     arrays.add(60);
     arrays.add(454);
     arrays.add(500);
     arrays.add(260);
     Collections.sort(arrays,Collections.reverseOrder());
     System.out.println("descending using collections reverse order");
    System.out.println(arrays);
    System.out.println("descending using list iterator");
    ListIterator<Integer> lists=arrays.listIterator();
    while(lists.hasPrevious())
    	System.out.println(lists.previous()+" ");
    while(lists.hasNext())
    	System.out.println(lists.next()+"");
    
	}

}
