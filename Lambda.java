
public class Lambda {
public static void main(String[] args) {
	Lambda lambda=new Lambda();
Helloda hello = () -> System.out.println("fnkj");
adds adds1=(int a,int b) -> a+b;
hello.hellos();

System.out.println(adds1.add(5,10));

Helloda hellor=new Helloda()
     {

	@Override
	public void hellos() {
		
		System.out.println("hello");
	}
	
      };
hellor.hellos();

Helloda helloews= ()-> System.out.println("hello");
helloews.hellos();
}
}
interface Helloda
{
	void hellos();
}
interface adds
{
	int add(int a,int b);
}