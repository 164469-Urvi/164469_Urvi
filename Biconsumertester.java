import java.util.function.BiConsumer;


public class Biconsumertester {

	public static void main(String[] args) {
	int [] some={1,2,3,4,5};
	int key=5;
	
	biconsumertest(some,key,(k,v)-> System.out.println(k+v));
	}

	private static void biconsumertest(int[] some,int key,BiConsumer<Integer,Integer> customer) {
		for(int i:some)
		{
			customer.accept(i, key);
		}
		
	}

}
