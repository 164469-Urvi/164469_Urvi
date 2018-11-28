import java.util.function.BiConsumer;


public class ExceptionHandling {

	public static void main(String[] args) {
		int []some={1,2,3,4,5,8};
		int key=0;
		calculateDivide(some,key,wrapperLambda((v,k)->System.out.println(v/k)));
		wrapperLambda();
	}

	private static void wrapperLambda() {
		// TODO Auto-generated method stub
		
	}

	public static void calculateDivide(int[] some,int key, BiConsumer wrapperLambda(BiConsumer<Integer,Integer> consumer){ 
	      for(int i:some)
	       {
		  BiConsumer.accept(i,key);
	    }
		
	}

}

